package arraytest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrAll {

	Scanner sc = new Scanner(System.in);

	String[][] dinoList;

	void Name() {
		int i;
		int j;
		dinoList = new String[5][3];
		for (i = 0; i < dinoList.length; i++) {
			System.out.println("공룡의 종을 입력해주세요: ");
			String Sel = sc.next();
			dinoList[i][0] = Sel;
			if (dinoList[i][0].equals("stop")) {
				int leng = dinoList.length;
				leng--;
				break;
			}
			for (j = 1; j < dinoList[i].length -1; j++) {
				System.out.println("공룡의 이름을 입력해 주세요: ");
				String Name = sc.next();
				dinoList[i][j] = Name;
				
				for(int l = 2; l < dinoList[i].length;l++ ) {
					System.out.println("공룡의 몸무게를 입력해주세요: ");
					String weight = sc.next();
					dinoList[i][l] = weight;
				}
			}

			System.out.println(Arrays.deepToString(dinoList[i]));

		}
		for(int k=0;k<i;k++) {
			System.out.println(Arrays.deepToString(dinoList[k]));
		}
		
	}
	
	void findWeight() {
		for(int a=0;a<dinoList.length;a++) {
			System.out.println("찾고자하는 몸무게를 입력해주세요: ");
			String wei = sc.next();
			if(dinoList[a][2].equals(wei)) {
				System.out.println(Arrays.deepToString(dinoList[a]));
				break;
			}
			
		}
	}
	

	public static void main(String[] args) {
		ArrAll all = new ArrAll();

		all.Name();
		all.findWeight();
		

	}

}
