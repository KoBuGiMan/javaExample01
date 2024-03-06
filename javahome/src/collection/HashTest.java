package collection;

import java.util.HashMap;
import java.util.Map;

public class HashTest {

	public static void main(String[] args) {
		Map<String, Integer> aMap = new HashMap<>();
		aMap.put("a", 30);
		aMap.put("b", 20);
		aMap.put("c", 10);
		
		int aOf = aMap.get("a");
		int bOf = aMap.get("b");
		System.out.println(aOf);
		System.out.println(bOf);
		System.out.println(aMap);
		aMap.put("c", 40);
		int cOf = aMap.get("c");
		System.out.println(cOf);
		System.out.println(aMap);
		
		aMap.remove("b");
		System.out.println(aMap);

		for(Map.Entry<String, Integer> entry : aMap.entrySet() ) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
		
		
		
	}
	
}
