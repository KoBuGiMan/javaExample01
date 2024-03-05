package appmain2;

import java.util.Scanner;

import time.Birth;
import time.Schedule;

public class AppPlay {

	public static void main(String[] args) {
		Birth birth = new Birth();
		Schedule sch = new Schedule();
		Scanner sc = new Scanner(System.in);
		PrintList p = new PrintList();
		int ans = 0;
		do {
			System.out.println("<<< 메인메뉴 >>>");
			System.out.println("1.공룡추가");
			System.out.println("2.공룡생일추가");
			System.out.println("3.공룡삭제");
			System.out.println("4.일반스케줄추가");
			System.out.println("5.안전점검일추가");
			System.out.println("6.일반스케줄체크");
			System.out.println("7.안전점검일체크");
			System.out.println("8.전체스케줄리스트");
			System.out.println("9.리스트문서화");
			System.out.println();
			System.out.print("1~9번 중 메뉴를 선택해주세요: "); 
			
			switch (sc.nextInt()){
			case 1: 
				birth.addDinosaur();
				break;
			case 2:
				birth.birthSet();
				break;
			case 3:
				birth.removeDinosaur();
				break;
			case 4:
				sch.setSchedule();
				break;
			case 5:
				sch.setSafetyDate();
				break;
			case 6:
				sch.scheduleCheck();
				break;
			case 7:
				sch.safetyDateCheck();
				break;
			case 8:
				sch.scheduleAll();
				break;
			case 9:
				p.printing(birth,sch);
			default:
				break;
			}
			System.out.print("메뉴를 다시 시작하시겠습니까? (1.yes/2.no): ");
			ans = sc.nextInt();
		}while(ans == 1);
		
		
	}
	
}
