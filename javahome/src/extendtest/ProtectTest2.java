package extendtest;

import extendExample.ProtectTest;

class Test extends ProtectTest{
	public void doThings() {
		system();
		this.system();
		Test t = new Test();
		t.system();
		//ProtectTest pro = new ProtectTest();
		//pro.system();
		
	}
	
}





public class ProtectTest2 {

	public static void main(String[] args) {
		Test test = new Test();
		test.doThings();
		
		
		
	}
}
