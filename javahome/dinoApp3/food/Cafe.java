package food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Cafe extends Food{

	List<Food> cafeList;
	HashMap<String, List<Food>> cafeMap;
	
	public Cafe() {
		cafeList = new ArrayList<>();
		cafeMap = new HashMap<>();
	}
	
	
	public List<Food> getCafeList() {
		return cafeList;
	}


	public void setCafeList(List<Food> cafeList) {
		this.cafeList = cafeList;
	}


	public HashMap<String, List<Food>> getCafeMap() {
		return cafeMap;
	}


	public void setCafeMap(HashMap<String, List<Food>> cafeMap) {
		this.cafeMap = cafeMap;
	}


	public void addCafeList() {
		Scanner sc = new Scanner(System.in);
		Cafe cafe = new Cafe();
		System.out.print("음료의 이름을 입력해주세요: ");
		setFoodName(sc.next());
		System.out.print("음료의 가격을 입력해주세요: ");
		setPrice(sc.nextInt());
		System.out.print("음료의 맛을 입력해주세요: ");
		setTaste(sc.next());
		System.out.print("음료의 수량를 입력해주세요: ");
		setFoodNum(sc.nextInt());
		
		getCafeList().add(cafe);
	}
	
	// 1
	public void autoAddCafe(String name,int price,String taste,int foodNum) {
		setFoodName(name); setPrice(price); setTaste(taste); setFoodNum(foodNum);
		getCafeList().add(this);
		getCafeMap().put(getCafeList().get(0).toString(), getCafeList());
		
	}
	
	public void addCafeMap() {
		getCafeMap().put(getFoodName(), getCafeList());
	}
	
	
}
