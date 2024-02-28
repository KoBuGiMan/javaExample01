package exeption;

public class InvaildAgeTest {

	public static void main(String[] args) {
		Invalid invaild = new Invalid(32);
		
		try {
			
			invaild.setAge(20);
		} catch (InvalidAgeException e) {
			
			
		}
	
	}
	
}
