package dino;

public abstract class DinoDefault {

	private String species;
	private String name;
	private String eat;
	private String play;

	public DinoDefault(String name,String eat,String play) {
		this.name = name;
		this.eat = eat; 
		this.play = play;

	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String getPlay() {
		return play;
	}

	public void setPlay(String play) {
		this.play = play;
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
	public void plusStr() {};

	public String toString() { 
		return "종:" + getSpecies() +" 이름:"+getName();
	}

}
