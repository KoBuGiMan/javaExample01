package dinoinfo;

public class Trikera extends DinoData<Trikera> implements DinoInterface<Trikera>{

	   protected String species;
	   protected int dangerNum;
	   public Trikera(){
	      this.species = "트리케라톱스";
	   }

	   public int getDangerNum() {
	      return dangerNum;
	   }

	   public void setDangerNum(int dangerNum) {
	      this.dangerNum = dangerNum;
	   }

	   public String getSpecies() {
	      return species;
	   }


	   @Override
	   public String toString() {
	      return  "종류:"+getSpecies()+ super.toString()+" 위험단계:"+getDangerNum();
	   }


	   @Override
	   public void add(Trikera dino,String name,int age,String eat,int dangerNum) {
	      dino.setName(name);
	      dino.setAge(age);
	      dino.setEat(eat);
	      dino.setDangerNum(dangerNum);
	      
	      super.getDinoAll().add(dino);
	      
	   }


	   public void trikeraAdd() {
	      Trikera  tri = new Trikera ();
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("추가할 트리케라톱스의 이름을 입력해주세요: ");
	      String name = sc.next();
	      System.out.print("추가할 트리케라톱스의 나이를 입력해주세요: ");
	      int age = sc.nextInt();
	      System.out.print("추가할 트리케라톱스의 식성을 입력해주세요: ");
	      String eat = sc.next();
	      System.out.print("추가할 트리케라톱스의 위험단계를 입력해주세요: ");
	      int dangerNum = sc.nextInt();
	      add(tri, name, age, eat, dangerNum);
	      
	      
	   }
	   
	   
	}
	
}