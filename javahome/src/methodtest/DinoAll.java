package methodtest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class DinoAll {

	Scanner sc = new Scanner(System.in);

	String[][] dino; //dino배열 [공룡 종,공룡 이름]

	//각 파트타임별 직업의 작업배열
	String[][] employeeMorning;// 오전파트
	String[][] employeeAfternoon;// 오후파트
	String[][] employeeEvening;// 야간파트

	
	//공룡 추가항목
	public static void addDino(DinoAll all) {

		System.out.println();
		System.out.println("///현재 공룡원의 공룡리스트///");
		System.out.println(Arrays.deepToString(all.dino));// 공룡배열을 String으로 바꾸어 출력(배열은 deepToString)
		System.out.println();
		
		// 공룡 종 입력
		System.out.println("추가할 공룡의 종을 입력해주세요: ");
		String addDino = all.sc.next();
		System.out.println();
		
		// 공룡 이름 입력
		System.out.println("추가할 공룡의 이름을 입력해주세요:");
		String addDino2 = all.sc.next();
		
		// 공룡 종과 이름을 받아 새 배열에 복사하여 배열을 뒤에 한칸 null값으로 만들고 해당칸에 새 항목을 집어넣어 기존배열에 덮어씌운다
		String[][] newArray = Arrays.copyOf(all.dino, all.dino.length + 1);
		newArray[all.dino.length] = new String[] { addDino, addDino2 };
		all.dino = newArray;
		
		// 결과
		System.out.println();
		System.out.println("///현재 공룡원의 공룡리스트///");
		System.out.println(Arrays.deepToString(all.dino));

	}

	// 공룡배열과 각 파트타임별 직원업무의 배열저장소 
	public DinoAll() {
		dino = new String[][] { { "티라노", "벅벅이" }, { "랩터", "용용이" }, { "트리케라톱스", "미미" } };
		employeeMorning = new String[][] { { "경비원", null }, { "환경미화원", null }, { "공룡관리사", null }, { "사무원", null },
				{ "안전관리사", null } };

		employeeAfternoon = new String[][] { { "경비원", null }, { "환경미화원", null }, { "공룡관리사", null }, { "사무원", null },
				{ "안전관리사", null } };
		employeeEvening = new String[][] { { "경비원", null }, { "환경미화원", null }, { "공룡관리사", null }, { "사무원", null },
				{ "안전관리사", null } };
	}

	// 공룡 삭제
	public static void removeDino(DinoAll all) {

		String removeDino;
		System.out.println();
		System.out.println("///현재 공룡원의 공룡리스트///");
		System.out.println(Arrays.deepToString(all.dino));
		System.out.println();
		
		// 공룡 종 입력. 맞으면 내부의 print문 실행
		System.out.println("정보를 삭제할 공룡의 종을 입력하세요: ");
		System.out.println();
		removeDino = all.sc.next();
		for (int i = 0; i < all.dino.length; i++) {
			if (all.dino[i][0].equals(removeDino)) {
				
				// 공룡 종이 맞고 이름이 같은지 확인
				System.out.println("정보를 삭제할 공룡의 이름을 입력하세요: ");
				String removeDino2 = all.sc.next();
				
				// 두 항목이 전부 맞으면 removeArr()메서드 실행
				if (all.dino[i][1].equals(removeDino2)) {
					all.dino = removeArr(all.dino, i);
					System.out.println();
					System.out.println("삭제되었습니다.");
					System.out.println();
					System.out.println("///현재 공룡원의 공룡리스트///");
					System.out.println(Arrays.deepToString(all.dino));

				}
			}
		}
		System.out.println();
		System.out.println("해당하는 공룡이 존재하지않습니다.");
		System.out.println();
		System.out.println("///현재 공룡원의 공룡리스트///");
		System.out.println(Arrays.deepToString(all.dino));

	}

	// removeArr매서드
	private static String[][] removeArr(String[][] array, int index) {
		//새 배열을 만드는데 기존배열보다 한칸 불여서 생성 (배열 하나를 삭제할거라 1개적게 생성)
		String[][] newArray = new String[array.length - 1][2];
		
		// 외부에서받은 array배열(dino배열)을 0번째 자리부터 index(i)개만큼(i값만큼(i값은 dinoRemove내부에 for문에서))
		// 내부에서 생성한 newArray를 0번째 자리부터 index(i)번째까지의 자리에 array배열(dino배열)을 집어넣는다
		System.arraycopy(array, 0, newArray, 0, index);
		
		// array배열(dino배열)을 index(i)+1번째 자리부터 array.length-index-1만큼 가져온다 
		// newArray배열을 index(i)번째 자리부터 array.length-index(i)-1까지의 값에 위에서 뽑은 array배열(dino배열)을 집어넣는다.
		System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
		// 각 항목을 입력받고 해당 메서드를 실행하고 newArray를 리턴해준다.
		// 그러면 dino배열에 newArray가 덮어씌어진다.
		// 결과적으로 i번째에 있는 배열은 삭제된채 수정된 배열을 반환.  
		return newArray;
	}

	// 현재 운영중인지 확인하는 로직
	public static void time() {
		
		// 각 "시"와 "분" 을 가져온다
		int hour = LocalDateTime.now().getHour();
		int min = LocalDateTime.now().getMinute();

		if (hour > 6 && hour < 12) {
			System.out.println("///////////////////");
			System.out.println("현재시간: " + hour + "시" + min + "분");
			System.out.println("영업여부: O / 오전파트");
			System.out.println("///////////////////");

		} else if (hour > 11 && hour < 18) {
			System.out.println("///////////////////");
			System.out.println("현재시간: " + hour + "시" + min + "분");
			System.out.println("영업여부: O / 오후파트");
			System.out.println("///////////////////");
		} else if (hour > 17 && hour < 22) {
			System.out.println("///////////////////");
			System.out.println("현재시간: " + hour + "시" + min + "분");
			System.out.println("영업여부: O / 야간파트");
			System.out.println("///////////////////");
		} else {
			System.out.println("///////////////////");
			System.out.println("현재 영업중이 아닙니다.");
			System.out.println("영업여부: X / 영업시간: 오전 7시 ~ 오후 10시");
			System.out.println("///////////////////");
		}

	}

	// 공룡에게 인사를 받을수있는 로직
	public static void hello(DinoAll all) {

		System.out.println();
		System.out.println("///현재 공룡원의 공룡리스트///");
		//배열은 deepToString
		System.out.println(Arrays.deepToString(all.dino));
		System.out.println();
		System.out.println("공룡의 이름을 입력해주세요: ");
		String dinoName = all.sc.next();
		System.out.println();
		System.out.println("자신의 이름을 입력해주새요: ");
		String myName = all.sc.next();

		System.out.println();
		System.out.println("/////////////////////////////////////////////");
		System.out.println();
		System.out.println("안녕!! 난 " + dinoName + "(이)야ㅎㅎ");
		System.out.println("너는 이름이 " + myName + "(이)구나! 이름 이쁘넹ㅋㅋㅋ");
		System.out.println("우리 공룡원에 놀러와줘서 고마워, 재미있게 놀고가!!!");
		System.out.println();
		System.out.println("/////////////////////////////////////////////");
		System.out.println();

	}

	// 현재 공룡원에 있는 관람객 수를 기반으로 포화상태를 체크하는 로직 
	public static void peopleCheck() {
		DinoAll all = new DinoAll();
		System.out.println();
		System.out.println("공룡원 최대수용인원: 30000명");
		System.out.println("현재 공룡원의 정원을 입력해주세요: ");
		int people = all.sc.nextInt();

		int peopleCheck = 30000 - people;
		int overPeople = people - 30000;

		if (people < 30000) {
			System.out.println();
			System.out.println("//////////////////////////");
			System.out.println();
			System.out.println("공룡원 최대수용인원: 30000명");
			System.out.println("현재 공룡원 관람객인원: " + people + "명");
			System.out.println("추가가능 관란객인원: " + peopleCheck + "명");
			System.out.println();
			System.out.println("//////////////////////////");
			System.out.println();
		} else if (people > 30000) {
			System.out.println();
			System.out.println("########수용가능인원을 초과하였습니다.#########");
			System.out.println();
			System.out.println("공룡원 최대수용인원: 30000명");
			System.out.println("현재 공룡원 관람객인원: " + people + "명");
			System.out.println("초과된 관람객인원" + overPeople);
			System.out.println();
			System.out.println("########################################");
		} else if (people == 30000) {
			System.out.println("#####################");
			System.out.println("#####################");
			System.out.println("### 축!! 30000명!! ###");
			System.out.println("#####################");
			System.out.println("#####################");
		} else {
			System.out.println("인원을 정확하게 입력해주십시요.");
		}

	}

	// 현재시간을 기준으로 각 직업별로 파트타임에 맞는 작업을 부여할 수 있는 로직
	public static void employeeAdd(DinoAll all) {

		int nowTime = LocalDateTime.now().getHour();
		
		// "네"를 입력할 시 진행, 그 외에 다른단어를 적으면 메뉴로 돌아감
		System.out.println();
		System.out.println("직원에게 작업을 부여하시겠습니까? (네/아니요)");
		String ans = all.sc.next();
		// 대답이 "네"일때 돌아가는 무한루프
		while (ans.equals("네")) {
			
			// 7시~12시까지의 오전파트 작업
			if (nowTime > 6 && nowTime < 12) {
				System.out.println();
				System.out.println("///// 현재 직업별 작업내용 /////");
				System.out.println(Arrays.deepToString(all.employeeMorning));
				System.out.println();
				System.out.println("작업을 부여할 직종을 입력해주세요: ");
				String employeeWork = all.sc.next();

				System.out.println("<<<현재는 7시 ~ 12시 오전입니다.>>>");
				for (int i = 0; i < all.employeeMorning.length; i++) {
					//입력한 값이 해단 배열에 존재하면 아래코드 실행
					if (employeeWork.equals(all.employeeMorning[i][0])) {
						// 현재 각 직업별 작업을 null값이 배정되있는데, 이곳에 작업내용을 입력하여
						// 직업별로 작업내용을 전달 할 수 있다.
						all.sc.nextLine();
						System.out.println(all.employeeMorning[i][0] + "의 작업내용을 입력해주세요: ");
						String work = all.sc.nextLine();
						all.employeeMorning[i][1] = work;
						break;
					}
				}
				System.out.println(Arrays.deepToString(all.employeeMorning));
				System.out.println("다른 직종도 작업을 부여하시겠습니까?");
				ans = all.sc.next();
				// 12시~18시까지의 오후파트 작업
			} else if (nowTime > 11 && nowTime < 18) {
				System.out.println();
				System.out.println("///// 현재 직업별 작업내용 /////");
				System.out.println(Arrays.deepToString(all.employeeAfternoon));
				System.out.println();
				System.out.println("작업을 부여할 직종을 입력해주세요: (네/아니요)");
				String employeeWork = all.sc.next();

				System.out.println("<<<현재는 12시 ~ 18시 오후입니다.>>>");
				for (int i = 0; i < all.employeeAfternoon.length; i++) {
					if (employeeWork.equals(all.employeeAfternoon[i][0])) {
						all.sc.nextLine();
						System.out.println(all.employeeAfternoon[i][0] + "의 작업내용을 입력해주세요: ");
						String work = all.sc.nextLine();
						all.employeeAfternoon[i][1] = work;
						break;
					}
				}
				System.out.println(Arrays.deepToString(all.employeeAfternoon));
				System.out.println("다른 직종도 작업을 부여하시겠습니까?");
				ans = all.sc.next();
				// 18시~22시까지의 야간파트 작업
			} else if (nowTime > 17 && nowTime < 24) {
				System.out.println();
				System.out.println("///// 현재 직업별 작업내용 /////");
				System.out.println(Arrays.deepToString(all.employeeAfternoon));
				System.out.println();
				System.out.println("작업을 부여할 직종을 입력해주세요: ");
				String employeeWork = all.sc.next();

				System.out.println("<<<현재는 18시 ~ 22시 야간입니다.>>>");
				for (int i = 0; i < all.employeeEvening.length; i++) {
					if (employeeWork.equals(all.employeeEvening[i][0])) {
						all.sc.nextLine();
						System.out.println(all.employeeEvening[i][0] + "의 작업내용을 입력해주세요: ");
						String work = all.sc.nextLine();
						all.employeeEvening[i][1] = work;
						break;
					}

				}
				System.out.println(Arrays.deepToString(all.employeeEvening));
				System.out.println("다른 직종도 작업을 부여하시겠습니까?");
				ans = all.sc.next();

			} else {
				System.out.println();
				System.out.println("현재는 모든 직원이 퇴근하였습니다.");
				System.out.println("개장시간: 7시 ~ 22시");
				break;
			}

		}
	}

	// 현재시간이 아닌 자신이 직접적은 시간대의 직업별 작업내용을 입력할 수 있는 로직
	public static void employeeAdd2(DinoAll all) {
		
		//다른 점은 LocalDateTime을 이용하는게 아닌 Scanner로 입력받은 
		//값을 기준으로 각 파트를 정한다.
		//내용은 거의 동일
		
		System.out.println();
		System.out.println("직원에게 작업을 부여하시겠습니까? (네/아니요)");
		System.out.println();
		String ans = all.sc.next();
		while (ans.equals("네")) {
			System.out.println("# 7시 ~ 12시: 오전타임");
			System.out.println("# 12시 ~ 18시: 오후타임");
			System.out.println("# 18시 ~ 22시: 야간타임");
			System.out.println("# 22시 ~ 7시: 폐장");
			System.out.println("현재시간중 \"시\"를 입력해주세요: ex) 1 ~ 24 ");
			int nowTime = all.sc.nextInt();
			if (nowTime > 6 && nowTime < 12) {
				System.out.println();
				System.out.println("////////// 오전타임 //////////");
				System.out.println("///// 현재 직업별 작업내용 /////");
				System.out.println(Arrays.deepToString(all.employeeMorning));
				System.out.println();
				System.out.println("작업을 부여할 직종을 입력해주세요: ");
				String employeeWork = all.sc.next();

				System.out.println("<<<현재는 7시 ~ 12시 오전타임입니다.>>>");
				for (int i = 0; i < all.employeeMorning.length; i++) {
					if (employeeWork.equals(all.employeeMorning[i][0])) {
						all.sc.nextLine();
						System.out.println(all.employeeMorning[i][0] + "의 작업내용을 입력해주세요: ");
						String work = all.sc.nextLine();
						all.employeeMorning[i][1] = work;
						break;
					}
				}
				if (all.employeeMorning == null) {
					all.employeeMorning = new String[][] {};
				}
				System.out.println(Arrays.deepToString(all.employeeMorning));
				System.out.println("다른 직종도 작업을 부여하시겠습니까?");
				ans = all.sc.next();

			} else if (nowTime > 11 && nowTime < 18) {
				System.out.println();
				System.out.println("////////// 오후타임 //////////");
				System.out.println("///// 현재 직업별 작업내용 /////");
				System.out.println(Arrays.deepToString(all.employeeAfternoon));
				System.out.println();
				System.out.println("작업을 부여할 직종을 입력해주세요: ");
				String employeeWork = all.sc.next();

				System.out.println("<<<현재는 12시 ~ 18시 오후타임입니다.>>>");
				for (int i = 0; i < all.employeeAfternoon.length; i++) {
					if (employeeWork.equals(all.employeeAfternoon[i][0])) {
						all.sc.nextLine();
						System.out.println(all.employeeAfternoon[i][0] + "의 작업내용을 입력해주세요: ");
						String work = all.sc.nextLine();
						all.employeeAfternoon[i][1] = work;
						break;
					}
					if (all.employeeAfternoon == null) {
						all.employeeAfternoon = new String[][] {};
					}
				}
				System.out.println(Arrays.deepToString(all.employeeAfternoon));
				System.out.println("다른 직종도 작업을 부여하시겠습니까?");
				ans = all.sc.next();

			} else if (nowTime > 17 && nowTime < 24) {
				System.out.println();
				System.out.println("////////// 야간타임 //////////");
				System.out.println("///// 현재 직업별 작업내용 /////");
				System.out.println(Arrays.deepToString(all.employeeAfternoon));
				System.out.println();
				System.out.println("작업을 부여할 직종을 입력해주세요: ");
				String employeeWork = all.sc.next();
				System.out.println();

				System.out.println("<<<현재는 18시 ~ 22시 야간타임입니다.>>>");
				for (int i = 0; i < all.employeeEvening.length; i++) {
					if (employeeWork.equals(all.employeeEvening[i][0])) {
						all.sc.nextLine();
						System.out.println(all.employeeEvening[i][0] + "의 작업내용을 입력해주세요: ");
						String work = all.sc.nextLine();
						System.out.println();
						all.employeeEvening[i][1] = work;
						break;
					}
					if (all.employeeEvening == null) {
						all.employeeEvening = new String[][] {};
					}

				}
				System.out.println(Arrays.deepToString(all.employeeEvening));
				System.out.println("다른 직종도 작업을 부여하시겠습니까?");
				ans = all.sc.next();

			} else {
				System.out.println("현재는 모든 직원이 퇴근하였습니다.");
				System.out.println("개장시간: 7시 ~ 22시");
				break;
			}

		}
	}

	public static void main(String[] args) {

		// 전체클래스를 선언해준다.
		DinoAll all = new DinoAll();
		
		// 메뉴 활성화버튼
		System.out.println("메뉴를 활성화시키겠습니까? (네/아니요)");
		String ans = all.sc.next();
		
		//위 구문에서 "네"를 입력하면 아래 while루프문이 돌아간다.
		while (ans.equals("네")) {
			
			// 1~7 사이 숫자를 입력하면 해당 메뉴를 실행시킬 수 있다.
			System.out.println();
			System.out.println("////////// 메뉴 //////////");
			System.out.println();
			System.out.println("1.공룡추가");
			System.out.println("2.공룡삭제");
			System.out.println("3.영업여부확인");
			System.out.println("4.공룡과 인사하기");
			System.out.println("5.관람객인원체크");
			System.out.println("6.직원작업관리(현재시간기준)");
			System.out.println("7.직원작업관리(시간직접입력)");
			System.out.println();
			System.out.println("메뉴를 선택해주세요: (1 ~ 7을 입력해주세요)");
			String menu = all.sc.next();
			
			// 각 숫자를 입력했을 때 나오게할 메뉴들
			if (menu.equals("1")) {
				addDino(all);
			} else if (menu.equals("2")) {
				removeDino(all);
			} else if (menu.equals("3")) {
				time();
			} else if (menu.equals("4")) {
				hello(all);
			} else if (menu.equals("5")) {
				peopleCheck();
			} else if (menu.equals("6")) {
				employeeAdd(all);
			} else if (menu.equals("7")) {
				employeeAdd2(all);
			}
			
			// 각 메뉴를 끝마치고 빠져나오면 아래구문이 실행되고 "네"를 입력한다면
			// 다시 while루프문이 돌아가 처음메뉴로 돌아가게 된다.
			System.out.println();
			System.out.println("------------------------");
			System.out.println("메뉴를 다시 활성화 시키겠습니까? (네/아니요)");
			ans = all.sc.next();
		}
		// "네"가 아닌 다른 문장을 입력했읗경우 종료
		System.out.println();
		System.out.println("이용해주셔서 감사합니다 *^^*");
		// Scanner 닫아주기
		all.sc.close();

	}

}