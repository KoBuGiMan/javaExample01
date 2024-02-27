package dino;

public class Raptor extends DinoDefault{

	
	
	public Raptor(String name, String eat, String play) {
		super(name, eat, play);
		
	}

	
	public void plusStr() {
		setSpecies("랩터");
		System.out.println(toString() + " 식성:"+getEat()+" 공격:"+getPlay());
		
	}
}
