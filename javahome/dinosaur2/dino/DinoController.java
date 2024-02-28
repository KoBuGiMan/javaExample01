package dino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DinoController {
	Scanner sc = new Scanner(System.in);
	List<List<String>> dinoList;

	public DinoController() {
		dinoList = new ArrayList<>();
	}
	
	public void addDino() {
		int yesNo = 0;
		int count = 0;
		do {
			System.out.println("추가할 공룡을 아래에서 골라주세요.");
			System.out.println("1.티라노사우루스");
			System.out.println("2.랩터");
			System.out.println("3.트리케라톱스");
			System.out.println("4.브라키오사우루스");
			int ans = sc.nextInt();

			if (ans == 1) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("식성:");
				String eat = sc.next();
				System.out.println("스킬:");
				String play = sc.next();
				DinoDefault dRax = new T_Rax(name, eat, play);
				dRax.setSpecies("티라노사우루스");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getDinoList());
				newArr.add(Arrays.asList(dRax.getSpecies(), name, eat, play));
				setDinoList(newArr);
				System.out.println(getDinoList().get(count));
				count++;
			} else if (ans == 2) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("식성:");
				String eat = sc.next();
				System.out.println("스킬:");
				String play = sc.next();
				DinoDefault dRap = new Raptor(name, eat, play);
				dRap.setSpecies("랩터");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getDinoList());
				newArr.add(Arrays.asList(dRap.getSpecies(), name, eat, play));
				setDinoList(newArr);
				System.out.println(getDinoList().get(count));
				count++;
			} else if (ans == 3) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("식성:");
				String eat = sc.next();
				System.out.println("스킬:");
				String play = sc.next();
				DinoDefault dTri = new Triceratops(name, eat, play);
				dTri.setSpecies("트리케라톱스");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getDinoList());
				newArr.add(Arrays.asList(dTri.getSpecies(), name, eat, play));
				setDinoList(newArr);
				System.out.println(getDinoList().get(count));
				count++;
			} else if (ans == 4) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("식성:");
				String eat = sc.next();
				System.out.println("스킬:");
				String play = sc.next();
				DinoDefault dBra = new Brakio(name, eat, play);
				dBra.setSpecies("브라키오사우루스");
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getDinoList());
				newArr.add(Arrays.asList(dBra.getSpecies(), name, eat, play));
				setDinoList(newArr);
				System.out.println(getDinoList().get(count));
				count++;
			} else {
				System.out.println("error");
				return;
			}
			System.out.println("공룡을 더 추가하시겠습니까? (1.yes,2.no)");
			yesNo = sc.nextInt();
		} while (yesNo == 1);
		for(int i=0;i<dinoList.size();i++) {			
			System.out.println(dinoList.get(i));
		}
	}

	public void removeDino() {
		System.out.println("이름:");
		String name = sc.next();
		for(int i=0;i<getDinoList().size();i++) {
			if(getDinoList().get(i).get(1).equals(name)) {
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getDinoList());
				newArr.remove(i);
				setDinoList(newArr);
				for(int j=0;j<getDinoList().size();j++) {
					System.out.println(getDinoList().get(j));
				}
			}else {
				System.out.println("입력하신 이름에 해당하는 공룡이 존재하지 않습니다.");
			}
		}
	}
	
	
	public void editDino() {
		System.out.println("이름:");
		String name = sc.next();
		for(int i=0;i<getDinoList().size();i++) {
			if(getDinoList().get(i).get(1).equals(name)) {
				System.out.println("수정한 종을 입력하세요:");
				String spesies = sc.next();
				System.out.println("수정한 이름을 입력하세요:");
				String ficName = sc.next();
				System.out.println("수정한 식성을 입력하세요:");
				String eat = sc.next();
				System.out.println("수정한 스킬을 입력하세요:");
				String play = sc.next();
				
				List<List<String>> newArr = new ArrayList<>();
				newArr.addAll(getDinoList());
				newArr.set(i, Arrays.asList(spesies,ficName,eat,play));
				setDinoList(newArr);
				for(int j=0;j<getDinoList().size();j++) {
					System.out.println(getDinoList().get(j));
				}
			}else {
				System.out.println("해당 이름은 존재하지 않습니다.");
			}
			
		}
	}
	
	public List<List<String>> getDinoList() {
		return dinoList;
	}

	public void setDinoList(List<List<String>> dinoList) {
		this.dinoList = dinoList;
	}

}
