package collection;

import java.util.ArrayList;
import java.util.List;

class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}

class FruitBox<T>{
	List<T> fruits = new ArrayList<>();
	
	public void add(T fruit) {
		fruits.add(fruit);
	}
	
}


public class Test {
	
	public void gTest() {
		
		FruitBox<Fruit> box = new FruitBox<>();
		
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Banana());
	}

}
