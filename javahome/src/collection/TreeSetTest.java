package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.age, other.age);
	}

	public String toString() {
		return "이름:" + this.name + "/나이:" + this.age;
	}

	public String getName() {
		return this.name;
	}

}

public class TreeSetTest {

	public static void main(String[] args) {

		Comparator<Person> nameCom = (p1, p2) -> p1.getName().compareTo(p2.getName());

		TreeSet<Person> personTreeName = new TreeSet<>(nameCom);
		personTreeName.add(new Person("춘식이", 5));
		personTreeName.add(new Person("춘배", 15));
		personTreeName.add(new Person("나비", 10));
		System.out.println(personTreeName.toString());
		
	}

}
