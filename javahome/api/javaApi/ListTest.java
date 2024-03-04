package javaApi;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void list() {
		List<String> list  = new ArrayList<>();
		
		list.add("제인");
		list.add("쥴리아");
		list.add("불칸");
		list.add("루이스");
		
		System.out.println(list);
		
		list.add(0,"마린");
		list.add(4,"바라");
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("메리"); list.add("죠아"); list.add("야거");
		System.out.println(list.contains("죠아"));
		System.out.println(list.get(0));
		System.out.println(list.indexOf("메리"));
		System.out.println(list.remove("죠아"));
		System.out.println(list);
		
		
		System.out.println();
		list();
		
		
	}
	
	
	
	
}
