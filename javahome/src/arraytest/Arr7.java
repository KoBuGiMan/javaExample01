package arraytest;

import java.util.Arrays;

public class Arr7 {

	public static void main(String[] args) {
		int[] results = {10,20,30,40,50};
		int[] copyResults = Arrays.copyOf(results, 6);
		
		System.out.println(Arrays.toString(copyResults));
		
		
	}
	
}
