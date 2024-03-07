package food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FoodDefault<T>{

	protected HashMap<String,HashMap<String,List<Food>>> foodAll;
	protected List<T> foodList;
	
	public FoodDefault(){
		foodAll = new HashMap<>(); 
		foodList = new ArrayList<>();
	}

	public void addMap(String name,HashMap<String,List<Food>> hash) {
		getFoodAll().put(name,hash);
		//getFoodAll().replace(name, hash);
		
	}
	
	

	public void addList(T food) {
		getFoodList().add(food);
	}

	public List<T> getFoodList() {
		return foodList;
	}
	
	public void setFoodList(List<T> foodList) {
		this.foodList = foodList;
	}
	public HashMap<String,HashMap<String,List<Food>>> getFoodAll() {
		return foodAll;
	}

	public void setFoodAll(HashMap<String,HashMap<String,List<Food>>> foodAll) {
		this.foodAll = foodAll;
	}
	
}
