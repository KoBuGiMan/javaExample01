package forpkg;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int sum = 0;
		boolean keep = true;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int n = sc.nextInt();

			if (n < 0) {
				keep = false;
			} else {
				sum += n;
			}
		} while (keep);
		System.out.println("Sum of Number: " + sum);
	}

}
