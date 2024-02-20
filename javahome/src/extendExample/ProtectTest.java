package extendExample;

class Another extends ProtectTest{
	
	public void doThing() {
		system();
	}
	
}

class Another2{
	void another2() {
		ProtectTest pro = new ProtectTest();
		pro.system();
	}
}

public class ProtectTest {

	protected void system() {
		System.out.println("프로텍트");
	}
	
}
