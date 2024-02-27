package zinfo;

public class Attacker extends DefaultAction {

	private int attackerNum;
	private double attackerCost;
	private int attackerAttack;
//	private int attackRan;
//	private double costRan;
	private int attackerPrice;

	public Attacker() {
		attackerPrice = 3;
		// 인구수
		attackerNum = 0;
		attackerAttack = 2;
		attackerCost = 0.5;
//		attackRan = (int) (Math.floor(Math.random() * 2) + 1);
//		costRan = (Math.floor(Math.random() * 1) + 1) * 0.5;
	}

	// 인구수증가
	public void attackerNumUp() {
		setAttackerNum(getAttackerNum() + 1);

	}

	// 코스트량 증가
	public double plusAttackerCost() {
		double sum = 0;
		for (int i = 0; i < getAttackerNum(); i++) {
			double random =  Math.round((Math.random()*6)*10/10.0);
			sum += random;
		}
		return sum;
	}

	// 공격력 증가
	public int attackerPlusAttack() {
		int sum = 0;
		for (int i = 0; i < getAttackerNum(); i++) {
			int random = ((int) (Math.random()*3));
			sum += random;
		}
		return sum;
	}

	public int getAttackerPrice() {
		return attackerPrice;
	}

	public void setAttackerPrice(int attackerPrice) {
		this.attackerPrice = attackerPrice;
	}

	public int getAttackerNum() {
		return attackerNum;
	}

	public void setAttackerNum(int attackerNum) {
		this.attackerNum = attackerNum;
	}

	public double getAttackerCost() {
		return attackerCost;
	}

	public void setAttackerCost(double attackerCost) {
		this.attackerCost = attackerCost;
	}

	public int getAttackerAttack() {
		return attackerAttack;
	}

	public void setAttackerAttack(int attackerAttack) {
		this.attackerAttack = attackerAttack;
	}

//	public int getAttackRan() {
//		return attackRan;
//	}
//
//	public void setAttackRan(int attackRan) {
//		this.attackRan = attackRan;
//	}
//
//	public double getCostRan() {
//		return costRan;
//	}
//
//	public void setCostRan(double costRan) {
//		this.costRan = costRan;
//	}

}
