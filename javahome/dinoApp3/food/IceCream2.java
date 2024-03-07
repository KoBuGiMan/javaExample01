package food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class IceCream2 extends Food {

	List<Food> iceCreamList;
	HashMap<String, List<Food>> iceCreamMap;

	public IceCream2(String foodName,int price,String taste, int foodNum) {
		this.foodName = foodName;
		this.price = price;
		this.taste = taste;
		this.foodNum = foodNum;
		
		iceCreamList = new ArrayList<>();
		iceCreamMap = new HashMap<>();
	}

//	public void addIceList() {
//		Scanner sc = new Scanner(System.in);
//		IceCream2 ice = new IceCream2();
//		System.out.print("아이스크림의 이름을 입력해주세요: ");
//		setFoodName(foodName);
//		System.out.print("아이스크림의 가격을 입력해주세요: ");
//		setPrice(sc.nextInt());
//		System.out.print("아이스크림의 맛을 입력해주세요: ");
//		setTaste(sc.next());
//		System.out.print("아이스크림의 수량를 입력해주세요: ");
//		setFoodNum(sc.nextInt());
//
//		getIceCreamList().add(ice);
//	}

	public void addIceMap() {
		getIceCreamMap().put(getFoodName(), getIceCreamList());

	}

	public void autoAddIce() {
		getIceCreamList().add(this);
		System.out.println(getFoodName());
		getIceCreamMap().put(getFoodName(), getIceCreamList());
		System.out.println(getIceCreamMap());
		
	}

	public List<Food> getIceCreamList() {
		return iceCreamList;
	}

	public void setIceCreamList(List<Food> iceCreamList) {
		this.iceCreamList = iceCreamList;
	}

	public HashMap<String, List<Food>> getIceCreamMap() {
		return iceCreamMap;
	}

	public void setIceCreamMap(HashMap<String, List<Food>> iceCreamMap) {
		this.iceCreamMap = iceCreamMap;
	}

}
