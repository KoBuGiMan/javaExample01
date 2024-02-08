package dinosaur;

import java.time.LocalTime;
import java.util.Scanner;

public class Scanner_Test2 {

	Scanner ans = new Scanner(System.in);
	String eating;
	Scanner ans2 = new Scanner(System.in);
	String species;
	Scanner ans3 = new Scanner(System.in);
	int year;
	Scanner ans4 = new Scanner(System.in);
	String size;
	Scanner ans5 = new Scanner(System.in);
	String job;
	Scanner ans6 = new Scanner(System.in);
	LocalTime now = LocalTime.now();
	int time = now.getHour();

	int secu;

	void eat(String eating) {
		this.eating = eating;
	}

	void eatCheck() {
		if (eating.equals("초식")) {
			System.out.println("초식");
		} else if (eating.equals("육식")) {
			System.out.println("육식");
		} else {
			System.out.println("오류");
		}
	}

	void species(String species) {
		this.species = species;
	}

	void speciesCheck() {
		switch (species) {
		case "티라노":
			System.out.println("뛰어놀아야하며 밝고 명랑하다.");
			break;
		case "랩터":
			System.out.println("성격이 괴팍하고 발톱이 커 조심해야한다.");
			break;
		case "트리케라톱스":
			System.out.println("성격이 온순하며 나무를 들이받는걸 좋아한다.");
			break;
		default:
			System.out.println("현재 저희 공원에는 없는 공룍입니다.");
		}
	}

	void year(int year) {
		this.year = year;
	}

	void yearCheck() {
		if (year >= 10) {
			System.out.println("경력 10년이상은 모든 공룡을 관리 가능합니다.");
		} else if (year > 5 && year < 10) {
			System.out.println("경력 10년이하 5년 이상은 트리케라톱스,랩터 관리가 가능합니다.");
		} else {
			System.out.println("경력 5년이하는 트리케라톱스 관리가 가능합니다.");
		}
	}

	void size(String size) {
		this.size = size;
	}

	void sizeCheck() {
		switch (size) {
		case "XS":
			System.out.println("XS사이즈는 1동입니다.");
		case "S":
			System.out.println("S사이즈는 2동입니다.");
		case "M":
			System.out.println("M사이즈는 3동입니다.");
		case "L":
			System.out.println("L사이즈는 4동입니다.");
		case "XL":
			System.out.println("XL사이즈는 5동입니다.");
		default:
			System.out.println("사이즈를 정확하게 입력해 주세요.");
		}

	}

	void job(String job) {
		this.job = job;
	}

	void jobCheck() {
		switch (job) {
		case "경비원":
			System.out.println("경비원은 보안업무를 위해 2동 정문으로 이동하십시오");
		case "공룡관리사":
			System.out.println("공룡관리사는 현재 4동 티라노가 임신중으로 4동위주로 관리하십시오");
		case "청소부":
			System.out.println("청소부는 현재 관람객이 많은 5동으로 이동해 주십시오");
		case "사무원":
			System.out.println("사무원은 1동 좌측에 위치한 사무실로 이동해 주십시오");
		default:
			System.out.println("집업을 정확하게 입력해 주세요");
		}

	}

	void timeCheck() {
		if (time >= 7 && time <= 21) {
			System.out.println("현재 영업중입니다.(영업시간: 7시 ~ 22시)");
		} else {
			System.out.println("현재 영업중이 아닙니다.(영업시간: 7시 ~ 22시)");
		}
	}

	void all(String job, int secu) {
		this.job = job;
		this.secu = secu;
	}

	void allCheck() {
		if (secu <= 2) {
			if (time <= 21 && time >= 7) {
				if (time >= 7 && time <= 11) {
					if (job.equals("경비원")) {
						System.out.println("안전등급이"+secu +"등급이고 오전이므로 2동 정문에서 대기해 주십시오");
					} else if (job.equals("공룡관리사")) {
						System.out.println("안전등급이"+secu +"등급이고 오전이므로 4동에 있는 랩터가족을 돌보십시오");
					} else if (job.equals("청소부")) {
						System.out.println("안전등급이"+secu +"등급이고 오전이므로 현재 지저분한 3동 내부를 청소해 주십시오");
					} else if (job.equals("사무원")) {
						System.out.println("안전등급이 "+secu +"등급이고 오전이므로 1동 좌측에 있는 사무실로 집합해주십시오");
					} else {
						System.out.println("직업을 정확하게 입력해 주십시오");
					}
				} else if (time >= 12 && time <= 17) {
					if (job.equals("경비원")) {
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 4동 후문에서 대기해 주십시오");
					} else if (job.equals("공룡관리사")) {
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 5동에 있는 임심한 티라노를 돌보십시오");
					} else if (job.equals("청소부")) {
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 현재 사람이 몰린 1동 외곽을 청소해 주십시오");
					} else if (job.equals("사무원")) {
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 3동 후방에 있는 회의실로 집합해주십시오");
					} else {
						System.out.println("직업을 정확하게 입력해 주십시오");
					}

				} else {
					if (job.equals("경비원")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 모든 동을 돌며 안전등급 갱신을 진행해 주십시오");
					} else if (job.equals("공룡관리사")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 모든 동에 있는 공룡의 상태를 갱신해 주십시오");
					} else if (job.equals("청소부")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 모든 동의 내부를 청소해 주십시오");
					} else if (job.equals("사무원")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 오늘 진행한 업무를 종합해주십시오");
					} else {
						System.out.println("직업을 정확하게 입력해 주십시오");
					}
				}
			} else {
				System.out.println("영업시간이 아니므로 모두 퇴근하였습니다.");
			}
		} else if (2 > secu && 4 >= secu) {

			if (time <= 21 && time >= 7) {
				if (time >= 7 && time <= 11) {
					if (job.equals("경비원")) {
						System.out.println("안전등급이 "+secu +"등급이고 오전이므로 모든 정문의 안전점검을 진행해주십시오");
					} else if (job.equals("공룡관리사")) {
						System.out.println("안전등급이 "+secu +"등급이고 오전이므로 1동부터 3동에 있는 공룡들을 돌보십시오");
					} else if (job.equals("청소부")) {
						System.out.println("안전등급이 "+secu +"등급이고 오전이므로 안전에 유의하여 4동을 청소해 주십시오");
					} else if (job.equals("사무원")) {
						System.out.println("안전등급이 "+secu +"등급이고 오전이므로 1동 우측에 있는 안전사무실로 집합해주십시오");
					} else {
						System.out.println("직업을 정확하게 입력해 주십시오");
					}
				} else if (time >= 12 && time <= 17) {
					if (job.equals("경비원")) {
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 모든 후문의 안전점검을 진행애 주십시오.");
					} else if (job.equals("공룡관리사")) {
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 4동부터 5동까지의 공룡을 돌보십시오");
					} else if (job.equals("청소부")) {
						System.out.println("안전등급이 "+secu +"2등급이고 오후이므로 안전에 유의하여 5동 외곽을 청소해 주십시오");
					} else if (job.equals("사무원")) {
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 3동 좌측에 있는 안전회의실로 집합해주십시오");
					} else {
						System.out.println("직업을 정확하게 입력해 주십시오");
					}

				} else {
					if (job.equals("경비원")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 모든 동을 돌며 안전등급 갱신을 진행해 주십시오");
					} else if (job.equals("공룡관리사")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 모든 동에 있는 공룡의 상태를 갱신해 주십시오");
					} else if (job.equals("청소부")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 모든 동의 내부를 청소해 주십시오");
					} else if (job.equals("사무원")) {
						System.out.println("안전등급이 "+secu +"등급이고 야간이므로 오늘 진행한 업무를 종합해주십시오");
					} else {
						System.out.println("직업을 정확하게 입력해 주십시오");
					}
				}
			} else {
				System.out.println("영업시간이 아니므로 모두 퇴근하였습니다.");
			}
		} else if (secu > 5) {
			System.out.println("정확한 안전등급을 등록해 주십시오");

		} else {
			if (time <= 21 && time >= 7) {

				if (job.equals("경비원")) {
					System.out.println("안전등급이 5등급이므로 모든 활동을 중단하고 안전점검을 진행하십시오");
				} else if (job.equals("공룡관리사")) {
					System.out.println("안전등급이 5등급이므로 모든 동에 있는 공룍의 상태를 진단하십시오");
				} else if (job.equals("청소부")) {
					System.out.println("안전등급이 5등급이므로 연재 업무를 중단하고 관람객의 안전에 기여하십시오");
				} else if (job.equals("사무원")) {
					System.out.println("안전등급이 5등급이므로 모든 파일을 외부저장소에 저장후 대피하십시오");
				} else {
					System.out.println("직업을 정확하게 입력해 주십시오");

				}
			} else {
				System.out.println("영업시간이 아니므로 모두 퇴근하였습니다.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner_Test2 data = new Scanner_Test2();
//		System.out.println("초식 or 육식: ");
//		String eatingType = data.ans.next();
//		System.out.println("공룡의 이름을 입력하세요: ");
//		String speciesType = data.ans2.next();
//		System.out.println("경력을 입력하세요: ");
//		int yearType = data.ans3.nextInt();
//		System.out.println("공룡의 사이즈를 입력해주세요: ");
//		String sizeType = data.ans4.next();
		System.out.println("직업을 입력해주세요: ");
		String jobType = data.ans5.next();
		System.out.println("안전등급을 입력해 주세요: ");
		int secuType = data.ans6.nextInt();

//		data.eat(eatingType);
//		data.species(speciesType);
//		data.year(yearType);
//		data.size(sizeType);
//		data.job(jobType);
		data.all(jobType, secuType);
		

		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
//		data.eatCheck();
//		data.speciesCheck();
//		data.yearCheck();
//		data.sizeCheck();
//		data.jobCheck();
//		data.timeCheck();
		data.allCheck(); 
	}
}
