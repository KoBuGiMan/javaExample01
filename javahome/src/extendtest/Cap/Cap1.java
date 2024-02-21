package extendtest.Cap;

import extendExample.ProtectTest;
import extendtest.ProtectTest2;

public class Cap1 extends ProtectTest{
	
	public void total1() {
		CapMain cap = new CapMain();
		cap.setName("도완득");
		cap.setAge(17);
		System.out.println("이름: " +cap.getName() +  " / 나이: " + cap.getAge());
		
	}
	public static void main(String[] args) {
		Cap1 cap = new Cap1();
		cap.system();
	}

}
