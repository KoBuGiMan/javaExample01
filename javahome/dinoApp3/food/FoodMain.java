package food;

import java.util.Scanner;
import java.util.Set;

public class FoodMain {

	protected int money;

	public FoodMain() {
		money = 30000;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void foodAllSet(IceCream ice,Restaurant res,Cafe cafe) {
		FoodDefault<Food> food = new FoodDefault<>();
		food.getFoodAll().put("아이스크림", ice.getIceCreamMap());
		food.getFoodAll().put("식당", res.getResMap());
		food.getFoodAll().put("카페", cafe.getCafeMap());
		System.out.println(food.getFoodAll());
	}

	// 마지막
	public void foodMain() {
		Scanner sc = new Scanner(System.in);
		FoodDefault<Food> food = new FoodDefault<Food>();
		System.out.println("<<< 식당메뉴 >>>");

		Set<String> key = food.getFoodAll().keySet();
		int a = 1;
		for (String keys : key) {
			System.out.println(a + "번." + keys);
			a++;
		}

		switch (sc.nextInt()) {
		case 1: {
			int sum = 0;
			Set<String> key2 = food.getFoodAll().get("아이스크림").keySet();
			for (String keys : key2) {
				System.out.println(keys);
			}
			System.out.print("구매할 아이스크림의 이름을 입력해주세요: ");
			String iceName = sc.next();
			System.out.println(food.getFoodAll().get("아이스크림").get(iceName));
			System.out.println();

			System.out.println("구매하시겠습니까? (1.yes/2.no)");
			if (sc.nextInt() == 1) {
				System.out.print("구매할 수량을 입력해주세요: ");
				int num = sc.nextInt();
				String stringIce = food.getFoodAll().get("아이스크림").get(iceName).get(1).toString();
				int intIce = Integer.parseInt(stringIce);
				sum += (num * intIce);
				setMoney(getMoney() - sum);
				System.out.println();
				System.out.println("현재 잔액:" + getMoney() + "원");
			}
			break;
		}
		case 2: {
			int sum = 0;
			Set<String> key3 = food.getFoodAll().get("식당").keySet();
			for (String keys : key3) {
				System.out.println(keys);
			}
			System.out.print("구매할 음식의 이름을 입력해주세요: ");
			String foodName = sc.next();
			System.out.println(food.getFoodAll().get("식당").get(foodName));
			System.out.println();
			System.out.println("구매하시겠습니까? (1.yes/2.no)");
			if (sc.nextInt() == 1) {
				System.out.print("구매할 수량을 입력해주십시요: ");
				int num = sc.nextInt();
				int intFood = Integer.parseInt(food.getFoodAll().get("식당").get(foodName).get(1).toString());
				sum += (num * intFood);
				setMoney(getMoney() - sum);
				System.out.println("현재 잔액:" + getMoney() + "원");

			}

			break;
		}
		case 3: {
			int sum = 0;
			Set<String> key4 = food.getFoodAll().get("카페").keySet();
			for (String keys : key4) {
				System.out.println(keys);
			}
			System.out.print("구매할 음료의 이름을 입력해주세요: ");
			String drinkName = sc.next();
			System.out.println(food.getFoodAll().get("카페").get(drinkName));
			System.out.println("구매하시겠습니까? (1.yes/2.no)");
			if (sc.nextInt() == 1) {
				System.out.print("구매할 수량을 입력해주십시요: ");
				int num = sc.nextInt();
				int intFood = Integer.parseInt(food.getFoodAll().get("카페").get(drinkName).get(1).toString());
				sum += (num * intFood);
				setMoney(getMoney() - sum);
				System.out.println("현재 잔액:" + getMoney() + "원");
			}
			break;
		}

		}

	}
	
	public static void main(String[] args) {
		IceCream ice = new IceCream();
		Restaurant res = new Restaurant();
		Cafe cafe = new Cafe();
		FoodMain main = new FoodMain();
		IceCream2 ice2 = new IceCream2("비비빅", 500, "단팥맛", 30);
		ice2.autoAddIce();
		IceCream2 ice3 = new IceCream2("월드콘", 1500, "월드컵맛", 20);
		ice3.autoAddIce();
		IceCream2 ice4 = new IceCream2("돼지바", 700, "달달한맛", 24);
		ice4.autoAddIce();
//		ice.autoAddIce("비비빅", 500, "단팥맛", 30);
//		ice.autoAddIce("월드콘", 1500, "월드컵맛", 20);
//		ice.autoAddIce("돼지바", 700, "달달한맛", 24);

		res.autoAddRes("파스타", 7500, "토마토맛", 12);
		res.autoAddRes("피자", 8000, "페퍼로니맛", 14);
		res.autoAddRes("치킨", 20000, "바삭한맛", 10);
		
		cafe.autoAddCafe("아메리카노", 1500, "고소한맛", 10);
		cafe.autoAddCafe("카페라떼", 3000, "부드러운맛", 8);
		cafe.autoAddCafe("카페모카", 4500, "달콤한맛", 5);
		main.foodAllSet(ice,res,cafe);

		main.foodMain();
		
		
	}

}
