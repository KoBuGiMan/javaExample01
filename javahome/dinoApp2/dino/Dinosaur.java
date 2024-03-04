package dino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Dinosaur {

	private String species;
	private String name;
	private String health;
	private List<List<String>> dinoList;

	public Dinosaur() {
		dinoList = new ArrayList<>();
	}

	public void addDinosaur() {
		Scanner sc = new Scanner(System.in);
		List<String> harfList = new ArrayList<>();
		System.out.print("공룡의 종을 입력해주세요: ");
		setSpecies(sc.next());
		harfList.add(getSpecies());
		System.out.print("공룡의 이름을 입력헤주세요: ");
		setName(getName());
		harfList.add(getName());
		System.out.print("공룡의 건강상태를 입력해주세요: ");
		setHealth(sc.next());
		harfList.add(getHealth());

		setDinoList(getDinoList(), harfList);
		
		for (int i = 0; i < getDinoList().size(); i++) {
			System.out.println(getDinoList().get(i));
		}
		
		sc.close();
	}

	public void removeDinosaur() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		for (int i = 0; i < getDinoList().size(); i++) {
			System.out.println(getDinoList().get(i));
		}
		System.out.println();
		System.out.print("삭제할 공룡의 종을 입력해주세요: ");
		String spe = sc.next();
		System.out.println("삭제할 공룡의 이름을 입력해주세요: ");
		String name = sc.next();

		for (int i = 0; i < getDinoList().size(); i++) {
			if (getDinoList().get(i).get(0).equals(spe)) {
				if (getDinoList().get(i).get(1).equals(name)) {
					getDinoList().remove(i);
					setDinoList(dinoList);
				}

			}

		}
		for (int i = 0; i < getDinoList().size(); i++) {
			System.out.println(getDinoList().get(i));
		}

	}

	public List<List<String>> getDinoList() {
		return dinoList;
	}

	public void setDinoList(List<List<String>> dinoList, List<String> list) {
		dinoList.add(list);
		this.dinoList = dinoList;
	}

	public void setDinoList(List<List<String>> dinoList) {
		this.dinoList = dinoList;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

}
