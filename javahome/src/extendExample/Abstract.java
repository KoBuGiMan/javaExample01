package extendExample;

abstract class A{
	
	int a,b;
	
	abstract void sum(int a, int b);
	abstract void minus(int a, int b);
	
}

interface C{
	void sum(int a,int b);
	void minus(int a,int b);	
}

class B extends A implements C{

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void minus(int a, int b) {
		System.out.println(a-b);
	}

}


public class Abstract {
	
	public static void main(String[] args) {
		B b = new B();
		
		b.sum(1, 2);
		b.minus(2, 1);
	}

}
