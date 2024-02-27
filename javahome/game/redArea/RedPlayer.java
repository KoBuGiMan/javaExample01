package redArea;

import zinfo.DefaultAction;

public class RedPlayer extends DefaultAction {

	private double redLife;
	private double redMoney;
	

	RedMineWorker rm = new RedMineWorker();
	RedNomalUnit rn = new RedNomalUnit();
	RedAttacker ra = new RedAttacker();
 
	public RedPlayer() {
		redMoney = 10;
		redLife = 200;

	}

	public double costSumRed(RedNomalUnit rn, RedMineWorker rm, RedAttacker ra) {

		double sum = (rm.minePlusCost() + rn.plusNomalAttack()
				+ ra.plusAttackerCost());
		return sum;
		
	}

	public double attackSumRed(RedNomalUnit rn, RedMineWorker rm, RedAttacker ra) {
		double sum = (rm.minePlusAttack() + rn.plusNomalAttack()
				+ ra.attackerPlusAttack());
		return sum;
	}

	public void autoBuy(RedNomalUnit rn, RedMineWorker rm, RedAttacker ra) {
		while (getredMoney() >= 1) {
			
			int ran = (int) (Math.random() * 3) + 1;
			if (getredMoney() >= 3) {
				if (ran == 1) {
					setredMoney(getredMoney() - rm.getMinePrice());
					rm.mineNumUp();
				} else if (ran == 2) {
					rn.nomalNumUp();
					setredMoney(getredMoney() - rn.getNomalPrice());
				} else if (ran == 3) {
					ra.attackerNumUp();
					setredMoney(getredMoney() - ra.getAttackerPrice());
				} 
			} else if (getredMoney() < 3 && getredMoney() >= 2) {
				ran = (int) (Math.random() * 2) + 1;
				if (ran == 1) {
					rn.setNomalNum(rn.getNomalNum() + 1);
					setredMoney(getredMoney() - rn.getNomalPrice());
				} else if (ran == 2) {
					rm.setMineNum(rm.getMineNum() + 1);
					setredMoney(getredMoney() - rm.getMinePrice());
				} else {

				}
			} else if (getredMoney() < 2 && getredMoney() >= 1) {
				rm.setMineNum(rm.getMineNum() + 1);
				setredMoney(getredMoney() - rm.getMinePrice());
			} else if (getredMoney() < 1 && getredMoney() >= 0) {
			}
		}
	}

	public double getRedLife() {
		return redLife;
	}

	public void setRedLife(double redLife) {
		this.redLife = redLife;
	}

	public double getredMoney() {
		return redMoney;
	}

	public void setredMoney(double redMoney) {
		this.redMoney = redMoney;
	}


}
