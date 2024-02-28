package appMain;

import java.util.Scanner;

import dino.DinoController;
import employee.EmployeeController2;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DinoController dinoC = new DinoController();
		EmployeeController2 empC = new EmployeeController2();
		int ans = 0;
		do {
			System.out.println("<<<<<< 메인메뉴 >>>>>>");
			System.out.println("1.공룡추가");
			System.out.println("2.공룡삭제");
			System.out.println("3.공룡수정");
			System.out.println("4.직원추가");
			System.out.println("5.직원삭제");
			System.out.println("6.직원수정");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				dinoC.addDino();
			case 2:
				dinoC.removeDino();
			case 3:
				dinoC.editDino();
			case 4:
				empC.addEmployee();
			case 5: 
				empC.removeEmp();
			case 6: 
				empC.editEmp();
			default:
				break;
			}

			System.out.println("메뉴를 재시작하시겠습니까? (1.yes/2.no)");
			ans = sc.nextInt();
		} while (ans == 1);
	}

}
