package dinoinfo;

	public class Reptor extends DinoData<Reptor> implements DinoInterface<Reptor>{

		   protected String species;
		   protected int dangerNum;
		   public Reptor(){
		      this.species = "랩터";
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
		   public void add(Reptor dino,String name,int age,String eat,int dangerNum) {
		      dino.setName(name);
		      dino.setAge(age);
		      dino.setEat(eat);
		      dino.setDangerNum(dangerNum);
		      
		      super.getDinoAll().add(dino);
		      
		   }


		   public void reptorAdd() {
		      Reptor rep = new Reptor();
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.print("추가할 랩터의 이름을 입력해주세요: ");
		      String name = sc.next();
		      System.out.print("추가할 랩터의 나이를 입력해주세요: ");
		      int age = sc.nextInt();
		      System.out.print("추가할 랩터의 식성을 입력해주세요: ");
		      String eat = sc.next();
		      System.out.print("추가할 랩터의 위험단계를 입력해주세요: ");
		      int dangerNum = sc.nextInt();
		      add(rep, name, age, eat, dangerNum);
		      
		      
		   }
		   
		   

	
}
