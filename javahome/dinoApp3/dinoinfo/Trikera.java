package dinoinfo;

import java.util.List;
import java.util.Scanner;

public class Trikera extends Dino{

	protected String species;
	protected int dangerNum;
	protected List<Dino> TriList;

	public Trikera() {
		this.species = "트리케라톱스";
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

	public void triAll() {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 트리케라톱스의 이름을 입력해주세요: ");
		String name = sc.next();
		setName(name);
		System.out.print("추가할 트리케라톱스의 나이를 입력해주세요: ");
		int age = sc.nextInt();
		setAge(age);
		System.out.print("추가할 트리케라톱스의 식성을 입력해주세요: ");
		String eat = sc.next();
		setEat(eat);
		System.out.print("추가할 트리케라톱스의 위험단계를 입력해주세요: ");
		int dangerNum = sc.nextInt();
		setDangerNum(dangerNum);
	}
	
	public List<Dino> getTriList() {
		return TriList;
	}

	public void setTriList(List<Dino> triList) {
		this.TriList = triList;
	}

	@Override
	public String toString() {
		return "종류:" + getSpecies() + super.toString() + " 위험단계:" + getDangerNum();
	}


}
