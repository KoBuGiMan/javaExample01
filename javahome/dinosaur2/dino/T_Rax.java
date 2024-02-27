package dino;

public class T_Rax extends DinoDefault{

	

	public T_Rax(String name, String eat, String play) {
		super(name, eat, play);
	}

	
	public void plusStr() {
		
		System.out.println(toString() + " 식성:"+getEat()+" 공격:"+getPlay());
		
	}

}
