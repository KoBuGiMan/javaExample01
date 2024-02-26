package redArea;

import zinfo.DefaultAction;

public class RedPlayer extends DefaultAction {

	private double redLife;
	private int redMoney;
	RedMineWorker rm = new RedMineWorker();
	RedNomalUnit rn = new RedNomalUnit();
	RedAttacker ra = new RedAttacker();

	public RedPlayer() {
		redMoney = 10;
		redLife = 200;

	}

	public double costSumRed() {

		double sum = (rm.minePlusCost() + rn.plusNomalAttack()
				+ ra.plusAttackerCost());

		return sum;
	}

	public double attackSumRed() {
		double sum = (rm.minePlusAttack() + rn.plusNomalAttack()
				+ ra.attackerPlusAttack());
		return sum;
	}

	public void autoBuy(RedNomalUnit rn, RedMineWorker rm, RedAttacker ra) {
		while (getredMoney() >= 1) {
			
			int ran = (int) (Math.random() * 3) + 1;
			if (getredMoney() > 3) {
				if (ran == 1) {
					setredMoney(getredMoney() - rm.getMinePrice());
					rm.mineNumUp();
					System.out.println("in");
				} else if (ran == 2) {
					rn.nomalNumUp();
					setredMoney(getredMoney() - rn.getNomalPrice());
					System.out.println("in2");
				} else if (ran == 3) {
					ra.attackerNumUp();
					setredMoney(getredMoney() - ra.getAttackerPrice());
					System.out.println("in3");
				} else {
					break;
				}
			} else if (getredMoney() < 3 && getredMoney() >= 2) {
				ran = (int) (Math.random() * 2) + 1;
				if (ran == 1) {
					rn.setNomalNum(rn.getNomalNum() + 1);
					setredMoney(getredMoney() - rn.getNomalPrice());
					break;
				} else if (ran == 2) {
					rm.setMineNum(rm.getMineNum() + 1);
					setredMoney(getredMoney() - rm.getMinePrice());
					break;
				} else {

				}
			} else if (getredMoney() < 2 && getredMoney() >= 1) {
				rm.setMineNum(rm.getMineNum() + 1);
				setCost(getredMoney() - rm.getMinePrice());
				break;
			} else if (getredMoney() < 1 && getredMoney() >= 0) {
				return;
			}
		}
	}

	public double getRedLife() {
		return redLife;
	}

	public void setRedLife(double redLife) {
		this.redLife = redLife;
	}

	public int getredMoney() {
		return redMoney;
	}

	public void setredMoney(int redMoney) {
		this.redMoney = redMoney;
	}

}
