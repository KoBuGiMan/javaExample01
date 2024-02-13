package methodtest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DinoAll {

	Scanner sc = new Scanner(System.in);

	String[][] dino = { { "티라노", "벅벅이" }, { "랩터", "용용이" }, { "트리케라톱스", "미미" } };

	public static String addDino() {
		DinoAll all = new DinoAll();
		String addDino;
		System.out.println("추가할 공룡의 종을 입력해주세요: ");
		addDino = all.sc.next();
		System.out.println("추가할 공룡의 이름을 입력해주세요:");
		String addDino2 = all.sc.next();
		String[][] newArray = Arrays.copyOf(all.dino, all.dino.length + 1);
		newArray[all.dino.length] = new String[]{addDino, addDino2};
		all.dino = newArray;
		System.out.println("현재 공룡: " + Arrays.deepToString(all.dino));
		return addDino;

	}

	public static String removeDino() {
		DinoAll all = new DinoAll();
		String removeDino;
		System.out.println("정보를 삭제할 공룡의 종을 입력하세요: ");
		removeDino = all.sc.next();
		for (int i = 0; i < all.dino.length; i++) {
			if (all.dino[i][0].equals(removeDino)) {
				System.out.println("정보를 삭제할 공룡의 이름을 입력하세요: ");
				String removeDino2 = all.sc.next();
				if (all.dino[i][1].equals(removeDino2)) {
					all.dino = removeArr(all.dino, i);
					System.out.println("삭제되었습니다.");
					System.out.println("현재 남아있는 공룡: " + Arrays.deepToString(all.dino));

				}
			}
		}
		System.out.println("해당하는 골룡이 존재하지않습니다.");
		return removeDino;
	}

	private static String[][] removeArr(String[][] array, int index) {
		String[][] newArray = new String[array.length - 1][2];
		System.arraycopy(array, 0, newArray, 0, index);
		System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
		return newArray;
	}
	
	public static void time() {
		int hour = LocalDateTime.now().getHour();
		int min = LocalDateTime.now().getMinute();
		
		if(hour>6 && hour<12) {
			System.out.println("현재시간: " + hour+"시"+min+"분");
			System.out.println("영업여부: O / 오전파트");
			
		}else if(hour>11 && hour<18) {
			System.out.println("현재시간: " + hour+"시"+min+"분");
			System.out.println("영업여부: O / 오후파트");
			
		}else if(hour>17 && hour<22) {
			System.out.println("현재시간: " + hour+"시"+min+"분");
			System.out.println("영업여부: O / 야간파트");
		}else {
			System.out.println("현재 영업중이 아닙니다.");
			System.out.println("영업여부: X / 영업시간: 오전 7시 ~ 오후 10시");
		}
		
	}
	
	public static void hello() {
		DinoAll all = new DinoAll();
		System.out.println("공룡의 이름을 입력해주세요: ");
		String dinoName = all.sc.next();
		System.out.println("자신의 이름을 입력해주새요: ");
		String myName = all.sc.next();
		
		System.out.println("안녕!! 난 " + dinoName + "이야ㅎㅎ");
		System.out.println("너는 이름이 "+myName + "이구나! 이름 이쁘넹ㅋㅋㅋ");
		System.out.println("우리 공룡원에 놀러와줘서 고마워, 재미있게 놀고가!!!");
		
		
	}

	public static void main(String[] args) {
		
		DinoAll all = new DinoAll();
		System.out.println("메뉴를 활성화시키겠습니까?");
		String ans = all.sc.next();
		while(ans.equals("네")) {
			System.out.println();
			System.out.println();
			System.out.println("////////// 메뉴 //////////");
			System.out.println();
			System.out.println("1.공룡추가");
			System.out.println("2.공룡삭제");
			System.out.println("3.영업여부확인");
			System.out.println("4.공룡과 인사하기");
			System.out.println();
			System.out.println("메뉴를 선택해주세요:");
			String menu = all.sc.next();
			if (menu.equals("1")) {
				addDino();
			} else if (menu.equals("2")) {
				removeDino();
			}else if (menu.equals("3")) {
				time();
			}else if(menu.equals("4")) {
				hello();
			}
			System.out.println();
			System.out.println("------------------------");
			System.out.println("메뉴를 다시 활성화 시키겠습니까?");
			ans = all.sc.next();
		}
		System.out.println("이용해주셔서 감사합니다 *^^*");

	}

}
