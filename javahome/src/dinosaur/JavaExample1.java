package dinosaur;

public class JavaExample1 {

	String name = "김태호";
	int age = 26;
	String species = "티라노사우르스";
	String hevivore = "육식";
	int weight = 1; // 톤

	public static void main(String[] args) {

		JavaExample1 dinosaur = new JavaExample1();

		System.out.println("이 공룡의 이름은 " + dinosaur.name + ", " + dinosaur.species + "입니다. 그리고 식성은 " + dinosaur.hevivore
				+ "이며 체중은 " + dinosaur.weight + "");
	}

}
