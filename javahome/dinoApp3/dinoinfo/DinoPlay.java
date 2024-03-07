package dinoinfo;

import java.util.List;
import java.util.Scanner;

public class DinoPlay {

	public static void main(String[] args) {
		DinoData<Dino> dino = new DinoData<>();
		
		Trex rex = new Trex();
		Reptor rep = new Reptor();
		Trikera tri = new Trikera();
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		do {
		System.out.println("<<< 메인메뉴 >>>");
		System.out.println("1.공룡추가");
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("<<< 공룡추가 >>>");
			System.out.println("1.티라노사우루스");
			System.out.println("2.랩터");
			System.out.println("3.트리케라톱스");
			switch (sc.nextInt()) {
			case 1:
				rex.rexAll();
				dino.add(rex);
				break;

			case 2:
				rep.repAll();
				dino.add(rep);
				break;
				
			case 3: 
				tri.triAll();
				dino.add(tri);
			}

			for (int i = 0; i < dino.getDinoAll().size(); i++) {
				System.out.println(dino.getDinoAll().get(i));
			}
			
		}
		case 2:{
			
		}
		default:

		}
		System.out.println("메뉴를 재시작하시겠습니까? (1.yes/2.no)");
		ans = sc.nextInt();
		}while(ans == 1);
		sc.close();
	}

}
