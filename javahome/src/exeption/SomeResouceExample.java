package exeption;

class SomeResouce implements AutoCloseable{

	public void doSomeThing() {
		System.out.println("Doing something...");
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("클로즈");
		
	}
	
}

public class SomeResouceExample {

	public static void main(String[] args) {
		try(SomeResouce someResouce = new SomeResouce()) {
			someResouce.doSomeThing();
		} catch (Exception e) {
			
		}
	}
}
