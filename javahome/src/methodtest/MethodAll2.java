package methodtest;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodAll2 {

	Scanner sc = new Scanner(System.in);

	public static void age() {

		MethodAll2 all = new MethodAll2();
		System.out.println("공룡의 나이를 입력해주세요: ");
		int x = all.sc.nextInt();
		if (x > 0 && x < 10) {
			System.out.println("공룡의 나이: " + x + "살");
			System.out.println("해당 공룡은 10살 미만이므로 아직 성장기입니다.");
		} else if (x >= 10 && x < 20) {
			System.out.println("공룡의 나이: " + x + "살");
			System.out.println("해당 공룡은 10살 이상 20살 미만이므로 현재 성체입니다.");
		} else if (x >= 20 && x < 30) {
			System.out.println("공룡의 나이: " + x + "살");
			System.out.println("해당 공룡은 20살 이상 30살 미만이므로 현재 중장년입니다.");
		} else if (x >= 30 && x < 50) {
			System.out.println("공룡의 나이: " + x + "살");
			System.out.println("해당 공룡은 30살 이상 50살 미만이므로 현재 노년입니다.");
		} else {
			System.out.println("공룡의 수명은 1살부터 50살까지 입니다.");
		}
	}

	public static void weight() {
		MethodAll2 all = new MethodAll2();
		System.out.println("공룡의 몸무게를 입력해주세요: ");
		int wei = all.sc.nextInt();

		double weiEat = wei * 0.05;

		System.out.println("현재 공룡의 몸무게: " + wei + "kg");
		System.out.println("사료 적정량: " + weiEat + "kg");

	}

	public static void ageCheck() {

		MethodAll2 all = new MethodAll2();
		List<Integer> ageArr = new ArrayList<>();

		int ageMid = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("공룡들의 나이를 입력해주세요: ");
			int age = all.sc.nextInt();

			ageMid += age;
			ageArr.add(age);

			if (age == 0) {
				ageArr.remove(i);
				System.out.println("모든 공룡의 나이: " + ageArr);
				System.out.println("현재 입력한 공룡들의 나이의 평균: " + ageMid / ageArr.size() + "살");
				break;
			}

		}

	}

	public static void time() {

		int now = LocalDateTime.now().getHour();
		int min = LocalDateTime.now().getMinute();
		String now2 = now + "시" + min + "분";

		if (now > 6 && 11 >= now) {
			System.out.println("현재시간 " + now2 + " 개장중이며, 오전입니다.");
		} else if (now > 11 && 17 >= now) {
			System.out.println("현재시간 " + now2 + " 개장중이며, 오후입니다.");
		} else if (17 < now && 22 > now) {
			System.out.println("현재시간 " + now2 + " 개장중이며, 야간입니다.");
		} else {
			System.out.println("현재시간 " + now2 + " 폐장되었으며, 운영시간은 7시 ~ 10시까지입니다.");
		}

	}

	public static String hel() {
		MethodAll2 all = new MethodAll2();
		System.out.println("자신의 이름을 입력해주세요: ");
		String hello = all.sc.next();
		System.out.println("공룡의 이름을 입력해주세요: ");
		String hi = all.sc.next();

		System.out.println(hello + "야 안녕? 내 이름은 " + hi + "! 놀러와줘서 고마워ㅎㅎ 재밌게 놀고가!!");

		return hello;
	}

	public static int people() {

		MethodAll2 all = new MethodAll2();
		System.out.println("현재 입장객을 입력하세요: ");
		int people = all.sc.nextInt();
		if (people > 30000) {
			System.out.println("정원이 초과되었습니다.");
			System.out.println("초과된 인원" + (people - 30000));
		} else if (people < 0) {
			System.out.println("인원을 정확하게 입력해주십시오");
		} else {
			int people2 = 30000 - people;
			System.out.println("현재인원: " + people + "명");
			System.out.println("입장가능인원: " + people2 + "명");
		}

		return people;
	}

	public static void main(String[] args) {

		MethodAll2 all = new MethodAll2();
		age();
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		weight();
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		ageCheck();
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		time();
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		hel();
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		people();
	}

}
