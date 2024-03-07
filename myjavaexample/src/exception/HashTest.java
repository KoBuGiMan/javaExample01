package exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HashTest {

	
	String name;
	int num;
	public HashTest(int num,String name) {
		this.num = num;
		this.name = name;
	}

	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HashTest hash = (HashTest) o;
		
		return num == hash.num &&Objects.equals(name, hash.name);
	}
	
	
	
	public int hashCode() {
		final int p = 31;
		int hash = 1;
		hash = p*hash+((name == null)? 0:name.hashCode());
		hash = p*hash+num;
		
		return hash; 
	}
	public String toString() {
		return "번호:" + num + " / 이름:"+name;
	}
	
	public static void main(String[] args) {
		HashMap<HashTest,String> list = new HashMap<>();
		HashTest test1 = new HashTest(1,"중복");
		HashTest test2 = new HashTest(1,"중복");

		list.put(test1,"겹침");
		list.put(test2,"겹침");
		System.out.println(list.size());
		System.out.println(list);
	}
	
}
