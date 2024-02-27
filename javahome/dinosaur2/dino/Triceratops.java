package dino;

public class Triceratops extends DinoDefault{

	
	public Triceratops( String name, String eat, String play) {
		super(name, eat, play);
		
	}
	
	

	public void plusStr() {
		setSpecies("트리케라톱스");
		System.out.println(toString() + " 식성:"+getEat()+" 공격:"+getPlay());
		
	}
}
