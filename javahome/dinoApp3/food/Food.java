package food;

public class Food {
	protected String foodName;
	protected int price;
	protected String taste;
	protected int foodNum;

	public int getFoodNum() {
		return foodNum;
	}

	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}

	public String getTaste() {
		return taste;
	}
	
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "상품명:"+foodName+" 가격:"+price+" 상품설명:"+taste+" 상품수량:"+foodNum; 
	}
	
}
