package dinoinfo;

public class DinoPlay extends DinoData<DinoPlay> {

	   public static void main(String[] args) {
	      Trex rex = new Trex();
	      Reptor rep = new Reptor();
	      Trikera tri = new Trikera();
	      DinoPlay dp = new DinoPlay();
	      
	      rex.tRexAdd();
	      rep.reptorAdd();
	      tri.trikeraAdd();

	      for(DinoPlay dino : dp.getDinoAll()) {
	         System.out.println(dino);
	      }
	   }
	   
	   
	}
