package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Person implements Comparable<Person>{
//	String name;
//	int age;
//
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	@Override
//	public int compareTo(Person other) {
//		return Integer.compare(this.age, other.age);
//	}
//
//	public String toString() {
//		return "이름:" + this.name + "/나이:" + this.age;
//	}
//	
//	public String getName() {
//		return this.name;
//	} 
//	
//	
//}

public class SortTest {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("제인",40));
		personList.add(new Person("사유리",25));
		personList.add(new Person("나라카이",30));
		
		for(Person p : personList) {
			System.out.println(p);
		}
		
		Comparator<Person> nameCom = new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				
				return p1.getName().compareTo(p2.getName());
			}
		};
		
		Comparator<Person> com = (p1,p2) ->
		Integer.compare(p1.getName().length(), p2.getName().length());
		
		Collections.sort(personList, com);
		
		System.out.println();
		for(Person p : personList) {
			System.out.println(p);
		}
	}
	
}
