package javaApi;

public class StringTest {

	public static void objectString() {
		String s = "가";
		s += "나";
		System.out.println(s);
		
		s.concat("다");
		System.out.println(s);
		
		s = s.concat("다");
		System.out.println(s);
	}
	
	
	public static void what(String s, StringBuilder sb) {
		
		s = s.concat("there");
		sb.append("there");
		System.out.println("what: " + s);
		System.out.println("what: " + sb);
		
		
	}
	
	public static void main(String[] args) {
		
		//objectString();
		
		String s = "Hi ";
		StringBuilder sb = new StringBuilder("Hi ");
		
		what(s,sb);
		System.out.println("main: " + s);
		System.out.println("main: " + sb);
		 
		
	}
	
}
