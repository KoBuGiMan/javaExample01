package zinfo;

public class MineWorker extends DefaultAction{
	
	private int mineRan;
	private int mineCost;
	private int mineNum;
	private double mineAttack;
	private int minePrice;

	

	public MineWorker() {
		//mine의 인구수
		mineNum = 0;
		// mine의 공격력
		mineAttack = 0.5;
		//mine들의 코스트 수확량의 기본값
		mineCost = 2;
		//mine의 가격
		minePrice = 1;
		
		
		
	}
	

	public void mineWorking() {
				
	}
	
	// mine들의 인구수 증가
	public void mineNumUp() {
		setMineNum(getMineNum()+1);
	}
	
	// 인구수 증가에따른 가져오는 코스트량 증가
	public int minePlusCost() {
		int sum = 0;
		for(int i=0;i<getMineNum();i++) {
			int random = (int) (Math.random()*3);
			sum += random;
			
		}
		return sum;
	}
	
	// mine의 인구수에 따른 공격력
	public double minePlusAttack() {
		double sum = 0;
		for(int i=0;i<getMineNum();i++) {
			double random = Math.round(Math.random()*6)/10.0;
			sum += random;
		}
		
		return sum;
	}
	
	
	
	public int getMinePrice() {
		return minePrice;
	}

	public void setMinePrice(int minePrice) {
		this.minePrice = minePrice;
	}



	
	public double getMineCost() {
		return mineCost;
	}

	public void setMineCost(int mineCost) {
		this.mineCost = mineCost;
	}
	
	public int getMineNum() {
		return mineNum;
	}
	
	public void setMineNum(int mineNum) {
		this.mineNum = mineNum;
	}
	
	
	
	
	public double getMineAttack() {
		return mineAttack;
	}
	
	public void setMineAttack(int mineAttack) {
		this.mineAttack = mineAttack;
	}
	
	
	public int getMineRan() {
		return mineRan;
	}
	
	public void setMineRan(int mineRan) {
		this.mineRan = mineRan;
	}
	
	
}
