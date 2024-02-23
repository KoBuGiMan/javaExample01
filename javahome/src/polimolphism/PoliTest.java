package polimolphism;

class Test {
	String name;
	int price;
	Test(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
	
}

class Test1 extends Test{
	
	Test1(){
		super("핫바",20000);
	}
	public String toString() {
		return "핫바";
	}
}


class Test2 extends Test{
	Test2(){
		super("김밥",3000);
		
	}
	public String toString() {
		return "김밥";
	}
	
}

class Customer{
	int money = 100000;
	
	void Cust(Test t) {
		if(money >= t.price) {
			System.out.println(t.name+"를 구매헸습니다.");
			money -= t.price;
			System.out.println("현재잔액:"+money);
		}else if(money <t.price) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재잔액:"+money);
		}
	}
	
}



public class PoliTest{

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Customer c = new Customer();
		
		c.Cust(t1);
		c.Cust(t2);
	}
	
	
	
}
