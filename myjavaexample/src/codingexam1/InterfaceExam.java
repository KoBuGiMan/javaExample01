package codingexam1;

interface Calculable {
	double PI = 3.14;

	int sum(int i, int b);
}

interface Printable {
	void print();
}

class RealCal implements Calculable, Printable {

	public int sum(int i, int b) {
		return i + b;
	}

	public void print() {
		System.out.println("RealCal");
	}

}

public class InterfaceExam {
	public static void main(String[] args) {

		RealCal rc = new RealCal();
		System.out.println(rc.sum(1, 2));
		rc.print();
		System.out.println(rc.PI);
		
		// 현재 Calculable 에 realCal을 집어넣었지만 print()가 작동하지 않는다.
		// 그 이유느 Calculabledms interface라는 불변의 법칙이고 이것을 갱신하는것은 불가능하다.
		// 하지만 만약 realCal안에 Calculable 과 동일한 메서드가 존재할때는 호출이 가능하다.
		// 그 증거로 sum은 출력이 된다.
		Calculable c = new RealCal();
		//c.print();
		System.out.println(c.sum(1, 2));
	}
}