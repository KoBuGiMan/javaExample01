package dinoinfo;

public class Dino {
	protected String name;
	protected int age;
	protected String eat;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	

	public String toString() {
		return " 이름:" + getName() + " 나이" + getAge() + " 식성:" + getEat();
	}


}
