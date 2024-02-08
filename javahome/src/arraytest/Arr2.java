package arraytest;

public class Arr2 {

	public static void main(String[] args) {
		double[] results = {7.0,8.6,9.0};
		double sum = 0.0;
		double avg = 0.0;
		
		for(int i = 0; i<results.length;i++) {
			sum += results[i];
		}
		
		avg = sum / results.length;
		
		System.out.println("Average is "+ avg);
		
	}
	
}
