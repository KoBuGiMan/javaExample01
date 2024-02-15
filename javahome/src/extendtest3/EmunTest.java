package extendtest3;

public class EmunTest {
	public static void main(String[] args) {

		Water stillWater = Water.STILL;

		Water sparkingWater = Water.valueOf("SPARKLING");
		System.out.println(sparkingWater);
		
		for(Water water : Water.values()){
			System.out.println(water.ordinal()+" / "+water.name());
		}
	}

}
