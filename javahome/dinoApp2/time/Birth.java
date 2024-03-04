package time;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import dino.Dinosaur;

public class Birth extends Dinosaur {
// hashmap
	LocalDate birth;

	public Birth(LocalDate birth) {
		this.birth = birth;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(int year, int month, int day) {
		this.birth = LocalDate.of(year, month, day);
	}

	public void birthSet() {
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

				
//				getDinoList().get(i).add();
				
			}
		}

		

	}

}
