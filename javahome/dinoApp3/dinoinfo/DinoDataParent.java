package dinoinfo;

import java.util.ArrayList;
import java.util.List;

public class DinoDataParent<T>{

	protected String species;
	protected String name;
	protected int age;
	protected String eat;
	protected List<T> dinoList;
	
	public DinoDataParent() {
		dinoList = new ArrayList<>();
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.age;
	}
	
}
