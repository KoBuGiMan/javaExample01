package dino;

import java.util.Arrays;
import java.util.Scanner;

interface Rule {
	public String[][] setDinoList(String[][] arr);

	String[] setAll();

}

public class Def implements Rule {
	Scanner sc = new Scanner(System.in);
	private String species;
	private String name;
	private String eat;
	private String length;

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

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String[] setAll() {
		System.out.println("종을 입력");
		setSpecies(sc.next());
		System.out.println("이름을 입력");
		setName(sc.next());
		System.out.println("식성을 입력");
		setEat(sc.next());
		System.out.println("크기를 입력");
		setLength(sc.next());
		String[] arr2 = new String[] { getSpecies(), getName(), getEat(), getLength() };
		return arr2;
	}

	public String[][] setDinoList(String[][] arr) {
		String[][] newArr = Arrays.copyOf(arr, arr.length + 1);
		try {
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			newArr[arr.length] = setAll();
		} catch (Exception e) {
			newArr[0] = setAll();
		}

		return newArr;

	}

}
