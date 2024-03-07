package food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Restaurant extends Food {

	List<Food> resList;
	HashMap<String, List<Food>> resMap;
	
	public Restaurant() {
		resList = new ArrayList<>();
		resMap = new HashMap<>();
	}
	
	public void addResList() {
		Scanner sc = new Scanner(System.in);
		Restaurant res = new Restaurant();
		System.out.print("음식의 이름을 입력해주세요: ");
		setFoodName(sc.next());
		System.out.print("음식의 가격을 입력해주세요: ");
		setPrice(sc.nextInt());
		System.out.print("음식의 맛을 입력해주세요: ");
		setTaste(sc.next());
		System.out.print("음식의 수량을 입력해주세요: ");
		setTaste(sc.next());
		
		getResList().add(res);
		
	}
	
	public void addResMap() {
		
		getResMap().put(getFoodName(), getResList());
		
	}

	public void autoAddRes(String name,int price,String taste,int foodNum) {
		setFoodName(name); setPrice(price); setTaste(taste); setFoodNum(foodNum);
		getResList().add(this);
		getResMap().put(getResList().get(0).toString(), getResList());
	}
	

	public List<Food> getResList() {
		return resList;
	}

	public void setResList(List<Food> resList) {
		this.resList = resList;
	}

	public HashMap<String, List<Food>> getResMap() {
		return resMap;
	}

	public void setResMap(HashMap<String, List<Food>> resMap) {
		this.resMap = resMap;
	}
	
	
	
	
	
	
	
}
