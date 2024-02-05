package dinosaur;

public class JavaExample2 {

	String din1;
	String din2;
	int din1Weight;
	int din2Weight;
	int food;
	int year;
	int people;
	int din1Age;
	int din2Age;
	int gard;
	int door;
	int lock;

	void dininfo(String din1, int din1Weight, String din2, int din2Weight) {
		this.din1 = din1;
		this.din2 = din2;
		this.din1Weight = din1Weight;
		this.din2Weight = din2Weight;
	}

	void dinfood() {

		if (din1Weight > 0) {
			food = din1Weight / 20;
			System.out.println(din2 + " / " + din1Weight + "kg" + " / " + "하루 사료량: " + food + "kg" + " / " + "한끼 사료량: "
					+ (food / 2) + "kg");
		}
	}

	void dinfood2() {

		if (din2Weight > 0) {
			food = din2Weight / 20;
			System.out.println(din2 + " / " + din2Weight + "kg" + " / " + "하루 사료량: " + food + "kg" + " / " + "한끼 사료량: "
					+ (food / 2) + "kg");
		}
	}

	void year(int year) {
		this.year = year;

	}

	void isLeapYear() {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("올해는 윤년입니다!!");
			System.out.println("현재년도: " + year + "년");
		} else {
			System.out.println("올해는 윤년이 아닙니다.");
			System.out.println("현재년도: " + year + "년");
		}
	}

	void full(int people) {
		this.people = people;
	}

	void fullPeo() {
		if (people >= 3000) {
			System.out.println("정원을 초과했습니다!!");
			System.out.println("현재인원:" + people + "명입니다!!");
		} else if (people < 3000 && people >= 2000) {
			System.out.println("현재 혼잡합니다!!");
			System.out.println("현재인원:" + people + "명입니다!!");
		} else if (people < 2000 && people >= 1000) {
			System.out.println("현재 한산합니다!!");
			System.out.println("현재인원:" + people + "명입니다!!");
		} else {
			System.out.println("관람객이 적습니다ㅠㅠ");
			System.out.println("현재인원:" + people + "명입니다ㅠㅠ");
		}
	}

	void dinAge(int din1Age, int din2Age) {
		this.din1Age = din1Age;
		this.din2Age = din2Age;
	}

	void dinAgeTwo() {
		System.out.println(din1 + "의 나이는 " + din1Age + "살 입니다.");
		System.out.println(din2 + "의 나이는 " + din2Age + "살 입니다.");

		if (din1Age > din2Age) {

			System.out.println("둘의 나이차이는 " + (din1Age - din2Age) + "살 차이로 " + din1 + "가(이) 더 늙었습니다!!");
		} else if (din2Age > din1Age) {
			System.out.println("둘의 나이차이는 " + (din2Age - din1Age) + "살 차이로 " + din1 + "가(이) 더 늙었습니다!!");
		} else {
			System.out.println("둘이 동갑입니다!!");
		}
	}

	void secu(int gard, int door, int lock) {
		this.gard = gard;
		this.door = door;
		this.lock = lock;
	}

	void secuCheck() {
		int secu = gard + door + lock;
		String total;
		if (secu >= 25) {
			total = "1등급";
		} else if (secu >= 20 && secu < 25) {
			total = "2등급";
		} else if (secu >= 15 && secu < 20) {
			total = "3등급";
		} else if (secu >= 10 && secu < 15) {
			total = "4등급";
		} else {
			total = "5등급";
		}
		System.out.println("경비원 상태: " + gard + "점");
		System.out.println("안전문 상태: " + door + "점");
		System.out.println("잠금장치 상태: " + lock + "점");
		System.out.println("총점: " + secu + "점");
		System.out.println();
		System.out.println("///////////////////");
		System.out.println(">결과: " + total+"<");
		System.out.println("///////////////////");
	}

	public static void main(String[] args) {
		JavaExample2 info = new JavaExample2();
		info.dininfo("용용이", 375, "벅벅이", 489); // 공룡 이름과 체중 
		info.year(2024);// 현재 년도
		info.full(2500); // 현재 인원
		info.dinAge(40, 30); // din1의 나이 , din2의 나이
		info.secu(5, 3, 7); // 경비원점수, 문의상태, 잠금장치 상태 각각 10점만점 총 30점

		System.out.println();
		info.isLeapYear();
		System.out.println();
		info.fullPeo();
		System.out.println();
		info.dinfood();
		info.dinfood2();
		System.out.println();
		info.dinAgeTwo();
		System.out.println();
		info.secuCheck();
		

	}

}
