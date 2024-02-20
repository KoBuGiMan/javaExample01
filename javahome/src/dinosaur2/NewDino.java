package dinosaur2;

import java.util.Arrays;
import java.util.Scanner;

// 공룡
public class NewDino {
	// 스캐너 선언
	Scanner sc = new Scanner(System.in);
	Danger danger = new Danger();
	// 캡슐화1: private로 오리지널 객체를 보호한다.
	private String[][] dinoList;
	private String species;
	private String name;
	private String age;
	private String area;
	private String eat;

	// dinoList를 빈 이차원 배열로 만든다.
	public NewDino() {
		this.dinoList = new String[0][];
	}

	// 캡슐화2
	// for문을 돌려 각 i값에 해당하는 배열을 coptList로 대입시킨다.
	public String[][] getDinoList() {
		String[][] copyList = new String[dinoList.length][];
		for (int i = 0; i < copyList.length; i++) {
			copyList[i] = Arrays.copyOf(dinoList[i], dinoList[i].length);
		}
		return copyList;
	}

	// 캡슐화2: get메서드와 set메서드를 이용해 오리지널객체에 직접 접근하지 못하게한다.
	// 반드시 get이나 set으로 한번 거쳐가야 본연의 객체를 해치지못한다.
	// doWhile문은 처음에 들어갈때 조건이 필요없기때문에 기능을 재실행시킬때 사용하면 용이하다.
	// String ansRe를 doWhile문을 돌리는 메개체로 만들고 아래 메서드가 실행되고 재실행을 묻는
	// 문장이 나올때 필자가 "네" 라고대답할때 반복되게만들고 그 이외엔 return시킨다.
	// 공룡추가
	public void setDinoList() {
		String ansRe = "미정";
		// 비상상황이 아닐때 작동
		if (danger.getOnOff().equals("off")) {
			do {

				System.out.println("공룡의 종을 입력해주세요: ex) 티라노,랩터...");
				setSpecies(sc.next());
				System.out.println("공룡의 이름을 입력해주세요:");
				setName(sc.next());
				System.out.println("공룡의 나이를 입력해주세요: ex)1,2,3...");
				setAge(sc.next());
				System.out.println("공룡의 구역을 입력해주세요: ex) 1동,2동...");
				setArea(sc.next());
				System.out.println("공룡의 식성을 입력해주세요: ex)초식,육식...");
				setEat(sc.next());

				// 이처럼 기본객체를 사용하더라도 한번 카피해서 사용하는걸 권장한다.
				dinoList = Arrays.copyOf(dinoList, dinoList.length + 1);
				// 위에서 set시켰던 객체들을 get으로 불러온 후 배열로 묶는다.
				String[] newArr = new String[] { getSpecies(), getName(), getAge(), getArea(), getEat() };
				// length-1을 해야 배열위치에 맞는다. (length는 배열의 갯수로 1부터시작이고 배열의 순서([]) 자체는 0부터시작이라
				// length에서 1을 빼준다.)
				dinoList[dinoList.length - 1] = newArr;
				// 불러올때는 get요청으로 불러오고, 배열은 deppToString을 사용안하면 배열이 오브젝트로 반환되어 내용이 출력되지 않는다.
				System.out.println(Arrays.deepToString(getDinoList()));
				// "네"를 입력하면 while문의 조건에 충족하므로 다시실행, 그외는 조건에서 벗어나므로 return 후 메인메뉴로 돌아간다.
				System.out.println("공룡을 추가로 저장하시겠습니까? (네/아니요)");
				ansRe = sc.next();
			} while (ansRe.equals("네"));
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	// 공룡삭제
	public void removeDino() {
		if (danger.getOnOff().equals("off")) {
			// if문을 사용하여 getDinoList가 빈배열이 아닐때만 실행되게 만들고 빈객체일땐 실행되지 않게 한다.
			// 이런 삭제하는 메서드는 반드시 null값에 대한 대비를 해주는게 좋다.
			if (getDinoList().length != 0) {
				// get을 이용하여 현재 리스트를 불러온다.
				getDinoList();
				// 각 객체를 입력받아 set에 넣는다.
				System.out.println("공룡의 종을 입력해주세요: ex)티라노, 랩터...");
				setSpecies(sc.next());
				System.out.println("공룡의 이름을 입력해주세요:");
				setName(sc.next());
				// 배열을 복사
				dinoList = Arrays.copyOf(dinoList, dinoList.length);
				// 원본객체보다 배열의 수가 하나 적은배열을 생성한다.
				String[][] newArr = new String[dinoList.length - 1][];
				// for문을 돌리며 if문의 조건에 부합하는 배열을 찾는다.
				for (int i = 0; i < dinoList.length; i++) {
					// 우선 "종"이 맞는지 확인한다.
					if (dinoList[i][0].equals (getSpecies())) {
						// 그 다음 이름이 맞는지 확인한다
						// 만약 "종"은 맞는데 이름이 다를때 continue문을 이용해 해당 i값을 건너뛴다.
						if (dinoList[i][2].equals(getName())) {
							// system.arratCopy는 객체를 복사하는 의미에선 copyOf와 비슷하지만 삭제하는데엔 더 용이하다.
							// 아래로 예시를 들자면 dinoList배열중 0번째에서 i번째까지의 배열을 newArr중 0번째부터 i번째까지 붙여넣는다.
							System.arraycopy(dinoList, 0, newArr, 0, i);
							// 여기에선 dinoList의 i번째부터 (dinoList.length - i - 1)번째까지의 배열을 newArr중 i번째부터
							// (dinoList.length - i - 1)번째에 붙여넣기를 한다.
							// 이렇게되면 출력했을때 i값에 해당하는 값을 제외한 나머지값이 newArr에 들어가게된다.
							// 필자는 아래코드를 선호하여 자주 사용한다.
							System.arraycopy(dinoList, i + 1, newArr, i, dinoList.length - i - 1);
							// newArr를 dinoList에 대입한다.
							dinoList = newArr;
						} else {
							continue;
						}
					}
				}
				// 배열출력은 deepToString
				System.out.println(Arrays.deepToString(dinoList));
				// 예외처리
			} else {
				System.out.println("현재 등록된 공룡이 없습니다.");
				return;
			}
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	// 공룡위치조회
	public void findDino() {
		// 위의 dowhile문과 동일한 방식
		String ans;
		if (danger.getOnOff().equals("off")) {
			do {
				// 배열이 0이 아닐때만 실행, 그외엔 예외처리
				if (getDinoList().length != 0) {
					// 우선 배열에 존재하는 공룡리스트를 불러온다.(가독성을 위해)
					getDinoList();
					// 종과 이름을 조회한다
					System.out.println("찾는공룡의 종을 입력하세요:");
					String spe = sc.next();
					System.out.println("찾는공룡의 이름을 입력하세요:");
					String name = sc.next();
					// 배열을 복사
					dinoList = Arrays.copyOf(dinoList, dinoList.length);
					// find를 설정하여 아래의 경우에 따라 나오는 값을 대입시킨다.
					String find;
					// for문을 이용해 해당 공룡이 있는지 조회
					for (int i = 0; i < dinoList.length; i++) {
						if (spe.equals(dinoList[i][0])) {
							if (name.equals(dinoList[i][1])) {
								// 동적인 값을 위해 해당 조건문이 돌아갈때마다 랜덤한 값을 도출하게 만들어
								// 랜덤값에 해당하는 if문에 속해있는 find값을 대입시킨다.
								int ran = (int) (Math.floor(Math.random() * 5) + 1);
								if (ran == 1) {
									find = "1구역";
								} else if (ran == 2) {
									find = "2구역";
								} else if (ran == 3) {
									find = "3구역";
								} else if (ran == 4) {
									find = "4구역";
								} else if (ran == 5) {
									find = "5구역";
									// 예외처리
								} else {
									System.out.println("error");
									return;
								}
								// find와 dinoList를 이용해 출력값을 만든다.
								System.out.println(
										"현재 " + dinoList[i][1] + "은 " + dinoList[i][3] + " " + find + "에 있습니다.");
							} else {
								// 해당 값이 아닐때 continue
								continue;
							}
						}
					}
				} else {
					// 예외처리
					System.out.println("현재 등록된 공룡이 없습니다.");
					return;
				}
				// "네"입력시 재실행
				System.out.println("다시 실행시키겠습니까? (네/아니요)");
				ans = sc.next();
			} while (ans.equals("네"));
		} else {
			System.out.println("현재 비상상황이므로 메뉴이용이 불가합니다.");
			System.out.println("해당 기능을 이용하려면 비상상황을 철회해주십시요.");
			return;
		}
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

}