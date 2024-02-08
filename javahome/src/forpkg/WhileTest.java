package forpkg;

import java.util.Scanner;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int num = 0;
		boolean keep = true;
		int sum = 0;
		
		while(keep) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int n = sc.nextInt();
			
			if(n<0) {
				keep = false;
			}else {
				sum += n;
			}
		}
		
		System.out.println("Sum of Number: "+sum);
		
	}
	
}
