package blueArea;

import java.util.Arrays;
import java.util.Scanner;

import redArea.RedAttacker;
import redArea.RedMineWorker;
import redArea.RedNomalUnit;
import redArea.RedPlayer;
import zinfo.DefaultAction;

public class BluePlayer extends DefaultAction {
	Scanner sc = new Scanner(System.in);
	BlueMineWorker bm = new BlueMineWorker();
	BlueNomalUnit bn = new BlueNomalUnit();
	BlueAttacker ba = new BlueAttacker();
	RedPlayer rp = new RedPlayer();
	RedMineWorker rm = new RedMineWorker();
	RedNomalUnit rn = new RedNomalUnit();
	RedAttacker ra = new RedAttacker();
	private int blueMoney;
	private double blueLife;
	private String[][] playerList;
	private String name;
			

	
	public BluePlayer() {
		blueMoney = 10;
		blueLife = 200;
		playerList = new String[0][];
	}

	public void BlueArea() {
		int yesNo = 0;
		do {
			System.out.println("닉네임을 입력해주세요:");
			String name = sc.next();
			setName(name);
			System.out.println("닉네임: " + getName());
			System.out.println("현재 닉네임으로 진행하시겠습니까? (1.yes/2.no)");
			int ans = sc.nextInt();
			if (ans == 1) {
				
				while (turn <= 30) {
					System.out.println();
					rp.autoBuy(rn, rm, ra);
					buyMenu();
					battleMenu();
					if(getBlueLife()<=0 || rp.getRedLife() <=0) {
						turn = 31;
						yesNo = 0;
						return;
					}
					turn++;
				}
				
				yesNo = 0;
				return;
			} else {
				System.out.println("게임을 재시작합니다.");
				yesNo = 1;
				return;
			}

		} while (yesNo == 1);
	}

	public double attackSumBlue() {
		double sum = (bm.minePlusAttack() + bn.plusNomalAttack()
				+ ba.attackerPlusAttack());
		return sum;
	}
	
	public double costSumBlue() {
		double sum = (bm.minePlusCost() + bn.plusNomalCost()
		+ ba.plusAttackerCost());
		return sum;
	}
	
	

	public void buyMenu() {
		System.out.println("<< 레드 진영 >>");
		System.out.println();
		System.out.println("광부: " + rm.getMineNum() + "명");
		System.out.println("시민: " + rn.getNomalNum() + "명");
		System.out.println("군인: " + ra.getAttackerNum() + "명");
		
		System.out.println("<< 블루 진영 >>");
		System.out.println();
		System.out.println("광부: " + bm.getMineNum() + "명");
		System.out.println("시민: " + bn.getNomalNum() + "명");
		System.out.println("군인: " + ba.getAttackerNum() + "명");
		System.out.println();
		System.out.println("현재 턴당 획득 코스트");
		System.out.println("광부:" + 0 + "~" + (bm.getMineCost() * bm.getMineNum()));
		System.out.println("시민:" + 0 + "~" + (bn.getNomalCost() * bn.getNomalNum()));
		System.out.println("군인:" + 0 + "~" + (ba.getAttackerCost() * ba.getAttackerNum()));
		System.out.println(
				"총 코스트: " + "0~" + (((bm.getMineCost() * bm.getMineNum())) + (bn.getNomalCost() * bn.getNomalNum()))
						+ (ba.getAttackerCost() * ba.getAttackerNum()));
		System.out.println("현재 턴당 공격력");
		System.out.println("광부:" + 0 + "~" + (bm.getMineAttack() * bm.getMineNum()));
		System.out.println("시민:" + 0 + "~" + (bn.plusNomalAttack() * bn.getNomalNum()));
		System.out.println("군인:" + 0 + "~" + (ba.getAttackerAttack() * ba.getAttackerNum()));
		System.out.println("총 공격력:" + 0 + "~" + ((bm.getMineAttack() * bm.getMineNum()))
				+ (bn.plusNomalAttack() * bn.getNomalNum()) + (ba.getAttackerAttack() * ba.getAttackerNum()));
		System.out.println("현재 보유금액:" + getblueMoney() + "원");
		System.out.println("유닛을 구매하시겠습니까? (1.yes/2.no)");
		int ans = sc.nextInt();
		do {
			System.out.println();
			System.out.println("<<<< 유닛 구매 >>>>");
			System.out.println("1. 광부구매");
			System.out.println("2. 시민구매");
			System.out.println("3. 군인구매");
			System.out.println("0. 구매종료");
			int buyUnit = sc.nextInt();
			if (buyUnit == 1) {
				System.out.println("광부를 몇명 구매하시겠습니까? (구매취소:0)");
				System.out.println("현재 보유금액:" + getblueMoney() + "원");
				int buyMine = sc.nextInt();
				if (buyMine * bm.getMinePrice() <= getblueMoney()) {
					setblueMoney(getblueMoney() - (buyMine * bm.getMinePrice()));
					bm.setMineNum(bm.getMineNum() + buyMine);
					System.out.println("현재 광부:" + bm.getMineNum() + "명");
					System.out.println("현재 보유금액:" + getblueMoney() + "원");
					return;
				} else if (buyMine * bm.getMinePrice() > getblueMoney()) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 보유금액:" + getblueMoney() + "원");
					return;
				} else {
					return;
				}
			} else if (buyUnit == 2) {
				System.out.println("시민을 몇명 구매하시겠습니까? (구매취소:0)");
				System.out.println("현재 보유금액:" + getblueMoney() + "원");
				int buyNomal = sc.nextInt();
				if (buyNomal * bn.getNomalPrice() <= getblueMoney()) {
					setblueMoney(getblueMoney() - (buyNomal * bn.getNomalPrice()));
					bn.setNomalNum(bn.getNomalNum() + buyNomal);
					System.out.println("현재 시민:" + bn.getNomalNum() + "명");
					System.out.println("현재 보유금액:" + getblueMoney() + "원");
					return;
				} else if (buyNomal * bn.getNomalPrice() > getblueMoney()) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 보유금액:" + getblueMoney() + "원");
					return;
				} else {
					return;
				}

			} else if (buyUnit == 3) {
				System.out.println("군인을 몇명 구매하시겠습니까? (구매취소:0)");
				System.out.println("현재 보유금액:" + getblueMoney() + "원");
				int buyAttacker = sc.nextInt();
				if (buyAttacker * ba.getAttackerPrice() <= getblueMoney()) {
					setblueMoney(getblueMoney() - (buyAttacker * ba.getAttackerPrice()));
					ba.setAttackerNum(ba.getAttackerNum() + buyAttacker);
					System.out.println("현재 군인:" + ba.getAttackerNum() + "명");
					System.out.println("현재 보유금액:" + getblueMoney() + "원");
					return;
				} else if (buyAttacker * ba.getAttackerPrice() > getblueMoney()) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 보유금액:" + getblueMoney() + "원");
					return;
				} else {
					return;
				}
			} else {

				System.out.println("구매를 종료하시겠습니까? (1.yes/2.no)");
				ans = sc.nextInt();
			}

		} while (ans == 2);

	}

	public void blueFirstAttack() {
		System.out.println("<< 븥루팀 선공 >>");
		System.out.println();
		System.out.println("<<<<<< 전투 시작 >>>>>>");
		System.out.println();
		System.out.println("블루팀의 공격!!!");
		System.out.println("레드팀 데미지:" + attackSumBlue());
		rp.setRedLife(rp.getRedLife() - attackSumBlue());
		System.out.println("레드팀 라이프:" + rp.getRedLife());
		System.out.println();
		System.out.println("레드팀의 공격!!!");
		System.out.println("블루팀 데미지:" + rp.attackSumRed());
		setBlueLife(getBlueLife() - rp.attackSumRed());
		System.out.println("블루팀 라이프:" + getBlueLife());
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("<<<<<< 현재 라이프 >>>>>>");
		System.out.println("블루팀 라이프:" + getBlueLife());
		System.out.println("레드팀 라이프:" + rp.getRedLife());
		System.out.println("------------------------------------------");
		System.out.println();

	}

	public void redFirstAttack() {
		System.out.println("<< 레드팀 선공 >>");
		System.out.println();
		System.out.println("<<<<<< 전투 시작 >>>>>>");
		System.out.println();
		System.out.println("레드팀의 공격!!!");
		System.out.println("블루팀 데미지:" + rp.attackSumRed());
		setBlueLife(getBlueLife() - rp.attackSumRed());
		System.out.println("블루팀 라이프:" + getBlueLife());
		if(getBlueLife() <=0) {
			System.out.println("블루팀의 라이프가 0입니다.");
			return;
		}
		System.out.println();
		System.out.println("블루팀의 공격!!!");
		System.out.println("레드팀 데미지:" + attackSumBlue());
		rp.setRedLife(rp.getRedLife() - attackSumBlue());
		System.out.println("레드팀 라이프:" + rp.getRedLife());
		if(rp.getRedLife()<=0) {
			System.out.println("레드팀의 라이프가 0입니다.");
			return;
		}
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("<<<<<< 현재 라이프 >>>>>>");
		System.out.println("블루팀 라이프:" + getBlueLife());
		System.out.println("레드팀 라이프:" + rp.getRedLife());
	}

	public void battleMenu() {

		System.out.println("전투를 시작합니다.");
		if (ba.getAttackerNum() > ra.getAttackerNum()) {
			blueFirstAttack();
			return;
		} else if (ba.getAttackerNum() < ra.getAttackerNum()) {
			redFirstAttack();
			return;
		} else {
			int ran = (int) (Math.random() * 2) + 1;
			if (ran == 1) {
				blueFirstAttack();
				return;
			} else {
				redFirstAttack();
				return;
			}
		}
		

	}

	public void addPlayerList() {
		String[][] newArr = Arrays.copyOf(getPlayerList(), getPlayerList().length+1);
		String[] newArr2 = new String[1];
		if(getBlueLife() <=0) {
			newArr2 = new String[] {getName(),"패배"};
		}else if(rp.getRedLife() <=0) {
			newArr2 = new String[] {getName(),"승리"};
		}
		newArr[getPlayerList().length] = newArr2;
		setPlayerList(newArr);
		
	}
	
	
	
	
	public void addCost() {
		System.out.println();
		System.out.println("<<<<<< 코스트 획득 >>>>>>");
		System.out.println();
		System.out.println(
				"블루팀 획득 코스트:" + costSumBlue());
		setCost(getblueMoney()+costSumBlue());		
		System.out.println("현재 블루팀 코스트:"+getCost());
		rp.setCost(rp.getCost() + rp.costSumRed());
		System.out.println("레드팀 획득 코스트:"+ rp.costSumRed() );
		System.out.println("---------------------------------------");
	}
	
	
	public String[][] getPlayerList() {
		return playerList;
	}

	public void setPlayerList(String[][] playerList) {
		this.playerList = playerList;
	}


	public double getBlueLife() {
		return blueLife;
	}

	public void setBlueLife(double blueLife) {
		this.blueLife = blueLife;
	}

	public int getblueMoney() {
		return blueMoney;
	}

	public void setblueMoney(int blueMoney) {
		this.blueMoney = blueMoney;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
