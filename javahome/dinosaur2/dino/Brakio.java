package dino;

public class Brakio extends DinoDefault{

	

	public Brakio(String name, String eat, String play) {
		super(name, eat, play);
		
	}
	public void plusStr() {
		setSpecies("브라키오사우루스");
		System.out.println(toString() + " 식성:"+getEat()+" 공격:"+getPlay());
		
	}
}
