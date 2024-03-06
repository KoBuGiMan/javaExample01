package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> userInfo = new HashMap<>();
		
		userInfo.put("dust", "7");
		userInfo.put("riceCack", "8");
		userInfo.put("bread", "6");
		
		Set<String> keys = userInfo.keySet();
		
		for(String key : keys) {
			System.out.println("키:" + key + "내용:" + userInfo.get(key));
		}
		
		
		Queue<String> printQ = new LinkedList<>();
		
		printQ.add("1빠");
		printQ.add("2빠");
		printQ.add("3빠");
		
		System.out.println(printQ.poll());
		System.out.println(printQ.poll());

		
		Set<String> names = new HashSet<>();
		names.add("엘리");
		names.add("제인");
		System.out.println(names);
		names.remove("엘리");
		System.out.println(names);
		
		
		Set<String> names2 = new LinkedHashSet<>();
		names2.add("엘리");
		names2.add("제인");
		System.out.println(names2);
		names2.remove("엘리");
		System.out.println(names2);
		
		Set<String> names3 = new TreeSet<>();
		names3.add("엘리");
		names3.add("제인");
		System.out.println(names3);
		names3.remove("엘리");
		System.out.println(names3);

	}
	
	
}
