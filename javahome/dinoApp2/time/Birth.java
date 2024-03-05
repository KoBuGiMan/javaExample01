package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import dino.Dinosaur;

public class Birth extends Dinosaur {
// hashmap
	LocalDate birth;

	public Birth() {
		
	}

	// 공룡의 생일 설정 및 배열에 추가
	public void birthSet() {
		int ans = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("공룡의 종을 입력하세요:");
			String spe = sc.next();
			System.out.print("공룡의 이름을 입력하세요:");
			String name = sc.next();

			for (int i = 0; i < getDinoList().size(); i++) {
				if (getDinoList().get(i).get(0).equals(spe) && getDinoList().get(i).get(1).equals(name)) {

					System.out.print("탄생년도: ");
					int year = sc.nextInt();
					System.out.print("월: ");
					int month = sc.nextInt();
					System.out.print("일: ");
					int day = sc.nextInt();
					setBirth(year, month, day);

					getDinoList().get(i).add(dateString(getBirth()));
				}
			}
			for (int i = 0; i < getDinoList().size(); i++) {
				System.out.println(getDinoList().get(i));
			}
			System.out.println("공룡의 생일을 추가로 등록하시겠습니까? (1.yes/2.no)");
			ans = sc.nextInt();
		} while (ans == 1);
	}

	// localDate String 변환
	public String dateString(LocalDate date) {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String str = date.format(form);
		return str;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(int year, int month, int day) {
		this.birth = LocalDate.of(year, month, day);
	}
}