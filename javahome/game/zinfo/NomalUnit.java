package zinfo;

public class NomalUnit extends DefaultAction{

//	private int nomalRan;
//	private int nomalPlusRan;
	private int nomalNum;
	private double nomalCost;
	private int nomalPrice;
	private double nomalAttack;

	
	public NomalUnit() {
		
		nomalPrice = 2;
		// 일밤유닛 인구수
		nomalNum = 0;
		// 일반유닛의 기본적인 코스트 수확량
//		nomalPlusRan = 1;

		nomalCost = 1;
		
		nomalAttack = 1;
		//랜덤값
//		nomalRan = (int) (Math.floor(Math.random()*1)+1); 
		
	}

	
	// 인구수증가
	public void nomalNumUp() {
		setNomalNum(getNomalNum()+1);
	}
	
	// 인구수 증가에 따른 공격력증가
	public double plusNomalAttack(){
		int sum = 0;
		for(int i=0;i<getNomalNum();i++) {
			double random =  Math.round((Math.random()*11)/10.0);
			sum += random;
		}
		return sum;
	}
	
	// 인구수에 따른 코스트량 증가
	public double plusNomalCost() {
		double sum = 0;
		for(int i=0;i<nomalNum;i++) {
			double random =  Math.round((Math.random()*11)/10.0);
			sum += random;
		}
		return sum;
	}
	
	
	public int getNomalPrice() {
		return nomalPrice;
	}
	public void setNomalPrice(int nomalPrice) {
		this.nomalPrice = nomalPrice;
	}
//	public int getNomalRan() {
//		return nomalRan;
//	}
//	public void setNomalRan(int nomalRan) {
//		this.nomalRan = nomalRan;
//	}
//	public int getNomalPlusRan() {
//		return nomalPlusRan;
//	}
//	public void setNomalPlusRan(int nomalPlusRan) {
//		this.nomalPlusRan = nomalPlusRan;
//	}
	public int getNomalNum() {
		return nomalNum;
	}
	public void setNomalNum(int nomalNum) {
		this.nomalNum = nomalNum;
	}
	public double getNomalCost() {
		return nomalCost;
	}
	public void setNomalCost(double nomalCost) {
		this.nomalCost = nomalCost;
	}

	public double getNomalAttack() {
		return nomalAttack;
	}

	public void setNomalAttack(double nomalAttack) {
		this.nomalAttack = nomalAttack;
	}

}
