package arraytest;

import java.util.Arrays;

public class Arr4 {

	public static void main(String[] args) {
		int[] results = {10,50,20,40,30};
		Arrays.sort(results);
		
		String arr = Arrays.toString(results);
		
		System.out.println(arr);
		System.out.println(arr.getClass().getName());
		
	}
	
}
