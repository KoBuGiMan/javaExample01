package javaApi;

import java.util.ArrayList;
import java.util.List;

final class FarmSet {
	
	private final String name;
	private final int numAnimal;
	private final List<String> animal;
	
	
	private FarmSet(final String name, final int numAnimal, final List<String> animal){
	
		this.name = name;
		this.numAnimal = numAnimal;
		this.animal = animal;
		
		
	}
	
	public static FarmSet createNewInstance(String name,int numAnimal,List<String> animal) {
		return new FarmSet(name,numAnimal,animal);
	}
	
	
	public String getName() {
		return name;
	}
	public int getNumAnimal() {
		return numAnimal;
	}
	public List<String> getAnimal() {
		return animal;
	}
	
	public String toString() {
		return "FarmSet{"+"name="+name+", numAnimal="+numAnimal+" animal="+animal+
				"}";
	}
}


public class Farm{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("cow");
		
		FarmSet f = FarmSet.createNewInstance("나만의농장", 30, list);
		System.out.println("생성: "+f);
		String name = f.getName();
		int numAnimal = f.getNumAnimal();
		List<String> animal = f.getAnimal();
		
		System.out.println(name+" "+numAnimal+ " " + animal);
		
		name = "너의농장";
		numAnimal = 50;
		animal.add("monkey");
		 
		System.out.println(f);
		
		
		
		
	}
	
	
	
	
	
}









