package zinfo;

public class DefaultAction {

	protected int turn;
	protected boolean attack;
	protected double cost;
	
	public DefaultAction(){
		turn = 1;
		cost = 10;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public boolean getAttack() {
		return attack;
	}
	public void setAttack() {
		this.attack = !this.attack;
	}
	
	
	
}
