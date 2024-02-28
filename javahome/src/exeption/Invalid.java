package exeption;


class InvalidAgeException extends Exception{
	InvalidAgeException(){
		super();
	}
	InvalidAgeException(String message){
		super(message);
	}
	InvalidAgeException(Exception e){
		super(e);
	}

}


public class Invalid {

	private int age;
	
	Invalid(int age){
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeException {
		this.age = age;
	}
	
	
	
	
}
