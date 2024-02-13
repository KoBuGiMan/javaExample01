package methodtest;

public class Method3 {

	public static void main(String[] args) {
		
		 int x = 19;            // 기본형
         int[] arr = {1, 2};     //  배열
         callByValue(x, arr);
         System.out.println(x);   // 19, unchanged
         
         
         System.out.println(arr[0] + ","  + arr[1]);  // -1, 2
         
         
         x = callByValue(x, arr);
         System.out.println(x);   // -1, changed
		
	}
	
	public static int callByValue(int x, int[] arr){
        x   = -1;
        arr[0] = -1;
        return x;
  }

}
