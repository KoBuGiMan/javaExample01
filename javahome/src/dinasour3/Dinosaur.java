package dinasour3;

import java.util.Arrays;
import java.util.Scanner;

public class Dinosaur {
	Scanner sc = new Scanner(System.in);
	
	private String[][] dinoList;
	private String dName;
	private String species;
	private String age;
	private String area;

	
	
	
	
	// 복사 생성자
	public Dinosaur() {
//		this.dName = dName;
//		this.age = age;
//		this.species = species;
//		this.area = area;
		this.dinoList = new String[0][];
	}
	
	
	// 복사 펙터리
	public static Dinosaur copyDino(Dinosaur dino) {
		Dinosaur copy = new Dinosaur();
		copy.dName = dino.dName;
		copy.age = dino.age;
		copy.species = dino.species;
		copy.area = dino.area;
		copy.dinoList =  Arrays.copyOf(dino.dinoList, dino.dinoList.length);
		return copy;
	}
	
	
	
	
	
	public void setDinoList() {
		String[] newArr = {getSpecies(),getdName(),getAge(),getArea()};
		dinoList = Arrays.copyOf(dinoList, dinoList.length+1);
		dinoList[dinoList.length-1] = newArr;
	}
	
	public String[][] getDinoList(){
		String[][] copyList = new String[dinoList.length][];
		for(int i=0;i<copyList.length;i++) {
			copyList[i] = Arrays.copyOf(dinoList[i], dinoList[i].length);
		}
		
		return copyList;
		
	}
	
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	public void dinoAll() {
		System.out.println("공룡의 종을 입력해주세요:");
		String spe = sc.next();
		System.out.println("공룡의 이름을 입력해주세요:");
		String name = sc.next();
		System.out.println("공룡의 나이를 입력해주세요:");
		String age = sc.next();
		System.out.println("공룡이 지낼 장소를 입력해주세요: ex)1동,2동....");
		String area = sc.next();
		setdName(name);
		setAge(age);
		setSpecies(spe);
		setArea(area);
		setDinoList();
		System.out.println(Arrays.deepToString(getDinoList()));
	}
	
	public static void main(String[] args) {
		Dinosaur di = new Dinosaur();
		di.dinoAll();
	}
}
