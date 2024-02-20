package extendExample;

class Animal2{
	public void Eat() {
		System.out.println("초식");
	}
}

class Dog extends Animal2{
	@Override
	public void Eat() {
		System.out.println("잡식");
	}
	
}

class Lion extends Animal2{
	@Override
	public void Eat() {
		System.out.println("육식");
	}
	
}


public class OverRide {

	public static void main(String[] args) {
		Animal2 animal = new Animal2();
		Dog dog = new Dog();
		Lion lion = new Lion();
		animal.Eat();
		dog.Eat();
		lion.Eat();
	} 
	
}
