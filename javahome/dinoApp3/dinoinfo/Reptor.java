package dinoinfo;

import java.util.List;
import java.util.Scanner;

public class Reptor extends Dino {

	protected String species;
	protected int dangerNum;
	protected List<Dino> RepList;

	public Reptor() {
		this.species = "랩터";
	}

	public int getDangerNum() {
		return dangerNum;
	}

	public void setDangerNum(int dangerNum) {
		this.dangerNum = dangerNum;
	}

	public String getSpecies() {
		return species;
	}

	@Override
	public String toString() {
		return "종류:" + getSpecies() + super.toString() + " 위험단계:" + getDangerNum();
	}

	public void repAll() {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 랩터의 이름을 입력해주세요: ");
		String name = sc.next();
		setName(name);
		System.out.print("추가할 랩터의 나이를 입력해주세요: ");
		int age = sc.nextInt();
		setAge(age);
		System.out.print("추가할 랩터의 식성을 입력해주세요: ");
		String eat = sc.next();
		setEat(eat);
		System.out.print("추가할 랩터의 위험단계를 입력해주세요: ");
		int dangerNum = sc.nextInt();
		setDangerNum(dangerNum);
	}
	
	public List<Dino> getRepList() {
		return RepList;
	}

	public void setTriList(List<Dino> RepList) {
		this.RepList = RepList;
	}

}
