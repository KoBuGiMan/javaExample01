package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//class Person {
//	String name;
//	int workYears;
//
//	Person(String name, int workYears) {
//		this.name = name;
//		this.workYears = workYears;
//	}
//
//	public String toString() {
//		return "이름:" + this.name + "/경력:" + this.workYears;
//	}
//}

public class CollectionTest2 {

	public static void main(String[] args) {

		List<String> stuName = new ArrayList<>();

		stuName.add("사라");
		stuName.add("테드");
		stuName.add("볼보");

		for (String student : stuName) {
			System.out.println(student);
		}

		List<Person> perName = new ArrayList<>();
		perName.add(new Person("사라", 6));
		perName.add(new Person("테드", 10));
		perName.add(new Person("볼보", 4));

		for (Person person : perName) {
			System.out.println(person.toString());
		}

		
		Set<String> email = new HashSet<>();
		email.add("seamonster@gmail.com");
		email.add("domination@naver.com");
		email.add("domination@naver.com");
		email.add("bugbug@naver.com");
		
		for(int i=0;i<email.size();i++) {
			System.out.println(email.toString());
		}
	}

}
