package dinosaur;

import java.util.Scanner;

public class Scanner_Test {
	public static void main(String[] args) {

		final int JAN = 1;
		final int FEB = 2;
		final int MAR = 3; // 상수
		final int APR = 4;
		final int MAY = 5;
		final int JUN = 6;
		final int JUL = 7;
		final int AUG = 8;
		final int SEP = 9;
		final int OCT = 10;
		final int NOV = 11;
		final int DEC = 12;

		int numDays = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente month -->");
		int mon = sc.nextInt();
		
		if(mon == JAN||mon == MAR||mon==MAY||mon==JUL||mon==OCT||mon==DEC) {
			numDays = 31;
		}else if(mon == APR||mon == JUN||mon==SEP||mon==NOV) {
			numDays = 30;
		}else if(mon == FEB) {
			System.out.println("Enter year -->");
			int year = sc.nextInt();
			
			if((year%400 == 0) || (year%4 == 0 && !(year%100 == 0))) {
				numDays = 29;
			}else {
				numDays = 28;
			}
			
		}else {
			System.out.println("Invalid month: " + mon);
		}
		if(numDays > 0) {
			System.out.println("Number of day is " +numDays);
		}

	}
}
