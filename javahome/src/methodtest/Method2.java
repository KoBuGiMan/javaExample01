package methodtest;

public class Method2 {

	public static void main(String[] args) {
		
		m1();
		m1(1);
		m1(1,2);
		m1(1,2,3);
		
	}
	
	public static void m1(int...args) { // ...args는 앞에적힌 타입의 변수들을 유동적으로 받을수있다.
										// {1,2,3}처럼 안에 수가 몇개든 타입만 틀리지 않다면 넣을수있다.
		int sum = 0;
		for(int i:args) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	
}
