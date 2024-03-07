package dinoinfo;


public class DinoData<T> {
	   protected String name;
	   protected int age;
	   protected String eat;
	   protected List<T> dinoAll;

	   public DinoData() {
	      dinoAll = new ArrayList<>();
	   }

	   public String getName() {
	      return name;
	   }

	   public List<T> getDinoAll() {
	      return dinoAll;
	   }

	   public void setDinoAll(List<T> dinoAll) {
	      this.dinoAll = dinoAll;
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

	   public void addDino(T dino) {
	      getDinoAll().add(dino);
	   }

