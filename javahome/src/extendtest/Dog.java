package extendtest;

public class Dog {
	private String dogName;
	
	public String setDogName(String dogName) {
		this.dogName = dogName;
		return dogName;
	}
	
	public String getDogName() {
		Dog d = new Dog();
		dogName = d.setDogName(dogName);
		return dogName;
	}
	
	
	
	
}
