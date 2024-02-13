package arraytest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrAll {

	Scanner sc = new Scanner(System.in);

	String[][] dinoList;
	String[][] dinoList2;

	void Name() {
		int i;
		int j;
		dinoList = new String[10][3];
		for (i = 0; i < dinoList.length; i++) {
			System.out.println("공룡의 종을 입력해주세요: ");
			String Sel = sc.next();
			dinoList[i][0] = Sel;
			if (Sel.equals("stop")) {
				dinoList2 = Arrays.copyOfRange(dinoList, 0, i);
				
				break;
			}
			for (j = 1; j < dinoList[i].length - 1; j++) {
				System.out.println("공룡의 이름을 입력해 주세요: ");
				String Name = sc.next();
				dinoList[i][j] = Name;

				for (int l = 2; l < dinoList[i].length; l++) {
					System.out.println("공룡의 몸무게를 입력해주세요: ");
					String weight = sc.next();
					dinoList[i][l] = weight;
				}
			}

			System.out.println(Arrays.deepToString(dinoList[i]));

		}
		for (int k = 0; k < i; k++) {
			System.out.println(Arrays.deepToString(dinoList[k]));
		}

	}

	void findWeight() {
		System.out.println("찾고자하는 몸무게를 입력해주세요: ");
		String wei = sc.next();
		for (int a = 0; a < dinoList2.length; a++) {
			if (dinoList2[a][2].equals(wei)) {
				System.out.println(Arrays.deepToString(dinoList2[a]));
				break;
			}

		}
	}

	void findSmallest() {

		String[] weightList = new String[dinoList2.length];
		System.out.println(Arrays.deepToString(dinoList2));
		System.out.println("가장 몸무게가 낮은 공룡을 찾겠습니까?");
		String weiAns = sc.next();
		if (weiAns.equals("네")) {
			for (int i = 0; i < dinoList2.length; i++) {
				String weight = dinoList2[i][2];
				if(weight != null) {
					
					weightList[i] = weight;
				}
				
			}
			Arrays.sort(weightList);
			for(int j=0; j<dinoList2.length;j++) {
				if(weightList[0].equals(dinoList2[j][2])) {
					System.out.println("가장 가벼운 공룡: " + Arrays.deepToString(dinoList2[j]));
					break;
				}
			}
		} else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		ArrAll all = new ArrAll();

		all.Name();
		all.findWeight();
		all.findSmallest();

	}

}
