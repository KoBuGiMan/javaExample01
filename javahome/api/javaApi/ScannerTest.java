package javaApi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void usingKeyboard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이입력:");

		if (sc.hasNextInt()) {
			int age = sc.nextInt();
			System.out.println(age);
		}
	}

	public static void usingFile() {
		// System.out.println(System.getProperty("user.dir"));
		// 절대경로를 상대경로처럼 쓸수있게 만드는 식
		try (Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\Sample.txt"))) {

			if (sc.hasNextInt()) {
				int age = sc.nextInt();
				int age2 = sc.nextInt();
				int age3 = sc.nextInt();
				int age4 = sc.nextInt();
				System.out.println(age + " " + age2 + " " + age3 + " " + age4);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	}

	public static void usingString() {
		String a = "Maaike   delim  vandelim Putten delim 22";
		Scanner sc = new Scanner(a).useDelimiter("\\s*delim\\s*");
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		sc.close();
	}

	public static void main(String[] args) {

		// usingKeyboard();
		// usingFile();
		usingString();
	}

}
