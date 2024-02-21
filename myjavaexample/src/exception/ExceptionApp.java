package exception;

public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		try {

			System.out.println(2 / 0);
		} catch (Exception e) {
			System.out.println("잫못된계산");
		}
		System.out.println(3);

	}

}
