package javaApi;

import java.util.ArrayList;
import java.util.List;

final class FarmSe {

	private final String name;
	private final int numAnimal;
	private final List<String> animal;

	private FarmSe(final String name, final int numAnimal, final List<String> animal) {

		this.name = name;
		this.numAnimal = numAnimal;
		this.animal = new ArrayList<>();

	}

	public static FarmSe createNewInstance(String name, int numAnimal, List<String> animal) {
		return new FarmSe(name, numAnimal, animal);
	}

	public String getName() {
		return name;
	}

	public int getNumAnimal() {
		return numAnimal;
	}

	public List<String> getAnimal() {
		return new ArrayList<>(animal);
	}

	public String toString() {
		return "FarmSet{" + "name=" + name + ", numAnimal=" + numAnimal + " animal=" + animal + "}";
	}
}


public class MyFarm {

	public static void main(String[] args) {
		
		List<String> animal = new ArrayList<>();
		animal.add("pig");
		animal.add("dog");
		FarmSet f = FarmSet.createNewInstance("농장장", 30, animal);
		
//		String name = f.getName();
//		int numAnimal = f.getNumAnimal();
//		List<String> ani = f.getAnimal();
//		f.get.add("cat");
		System.out.println(f.getName() +" "+ f.getNumAnimal() +" "+ f.getAnimal());
		
	}
	
}
