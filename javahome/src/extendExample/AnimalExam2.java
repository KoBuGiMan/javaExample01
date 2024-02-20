package extendExample;

class Animal4 {
	double weight = 1000.0;
	static int age = 10;

	public void Species() {
//		return new Animal4();
		System.out.println("코끼리");
	}

	public static void name() {
		System.out.println("코코잠보");
	}
}

class Tiger extends Animal4 {
	
	double weight = 400.0;
	static int age = 20;
	

//	public void Species() {
//		return new tiger();
//	}
	
	public void Species() {
		super.Species();
		System.out.println("호랑이");
	}

	// 느낌상 static이 붙은 class변수는 override를 쓰는게 아닌거같다.
	public static void name() {
		System.out.println("호세");
	}

	public static void name(String n) {
		System.out.println(n);
	}
}

public class AnimalExam2 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.Species();
//		tiger.Species();
//		// static을 사용한 메서드를 호출할땐 클래스명을 붙여주면된다.
//		Tiger.name();
//		// 해당값도 static 이기 때문에 클래스이름을 적어줘야한다.
//		Tiger.age = 60;
//		Tiger.name("범");
//		System.out.println(Tiger.age);
		
		
		
//		int i = 12;
//		int j = 0;
//		
//		try {
//			System.out.println(i/j);
//		} catch (Exception e) {
//			System.out.println("0");
//		}
	}

}
