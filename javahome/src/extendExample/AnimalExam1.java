package extendExample;

class Animal3{
	public void Live() {
		System.out.println("육지");
	}
}

class Fish extends Animal3{
	public void Live() {
		System.out.println("바다");
	}
}

class Bird extends Animal3{
	public void Live() {
		System.out.println("하늘");
	}
}

public class AnimalExam1 {

	
	public static void main(String[] args) {
		Animal3 animal = new Animal3();
		Fish fish = new Fish();
		Bird bird = new Bird();
		animal.Live();
		fish.Live();
		bird.Live();
		System.out.println("---------------");
		doA(animal);
		doA(fish);
		doA(bird);
		
		
	}
	public static void doA(Animal3 animal) {
		animal.Live();
	}
	
}
