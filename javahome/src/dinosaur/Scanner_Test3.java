package dinosaur;

import java.time.LocalTime;
import java.util.Scanner;

public class Scanner_Test3 {

	Scanner ans5 = new Scanner(System.in);
	String job;
	Scanner ans6 = new Scanner(System.in);
	LocalTime now = LocalTime.now();
	int time = now.getHour();
	String dinoName;
	Scanner ans7 = new Scanner(System.in);
	int dinoWeight;
	Scanner ans8 = new Scanner(System.in);
	int secu;



	void all(String job, int secu ,String dinoName, int dinoWeight) {
		this.job = job;
		this.secu = secu;
		this.dinoName = dinoName;
		this.dinoWeight = dinoWeight;
	}
	
	void all2(String job, int secu ) {
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
		} else if (2 < secu && 4 >= secu) {

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
						System.out.println("안전등급이 "+secu +"등급이고 오후이므로 안전에 유의하여 5동 외곽을 청소해 주십시오");
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
					System.out.println("안전등급이 5등급이므로 모든 동에 있는 공룡들의 상태를 진단하십시오");
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
		Scanner_Test3 data = new Scanner_Test3();

		System.out.println("안전등급을 입력해 주세요: ");
		int secuType = data.ans6.nextInt();
		System.out.println("직업을 입력해주세요: ");
		String jobType = data.ans5.next();
		
		if(jobType.equals("공룡관리사") && secuType < 5 ) {
			System.out.println("관리하는 공룡의 이름을 입력해 주세요: ");
			String dinoNameType = data.ans7.next();
			System.out.println("공룡의 몸무게를 입력해 주세요: ");
			int dinoWeightType = data.ans8.nextInt();
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println();
			System.out.println("공룡이름: "+dinoNameType);
			System.out.println("몸무게: "+dinoWeightType + "kg");
			Double dinoWeightType2 =  (double) dinoWeightType;
			System.out.println("사료량: " + dinoWeightType2*0.05 + "kg" );
			data.all(jobType, secuType, dinoNameType, dinoWeightType); 
		}else {
			data.all2(jobType, secuType);
		}

		

		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();

		data.allCheck(); 
	}
}
