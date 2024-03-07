package dinoinfo;

	public class Trex extends DinoData<Trex> implements DinoInterface<Trex>{
		   protected String species;
		   protected int dangerNum;
		   public Trex(){
		      this.species = "티라노사우루스";
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
		   public void add(Trex dino,String name,int age,String eat,int dangerNum) {
		      dino.setName(name);
		      dino.setAge(age);
		      dino.setEat(eat);
		      dino.setDangerNum(dangerNum);
		      
		      super.getDinoAll().add(dino);
		      
		   }


		   public void tRexAdd() {
		      Trex  rex = new Trex();
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.print("추가할 티라노사우루스의 이름을 입력해주세요: ");
		      String name = sc.next();
		      System.out.print("추가할 티라노사우루스의 나이를 입력해주세요: ");
		      int age = sc.nextInt();
		      System.out.print("추가할 티라노사우루스의 식성을 입력해주세요: ");
		      String eat = sc.next();
		      System.out.print("추가할 티라노사우루스의 위험단계를 입력해주세요: ");
		      int dangerNum = sc.nextInt();
		      add(rex, name, age, eat, dangerNum);
		      
		      
		   }
		   

}
