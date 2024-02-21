package employee;

import java.util.Arrays;

public class Gard extends Def2 implements Rule2{

	private String[][] gardList;
	public Gard() {
		gardList = new String[0][];
	}
	public String[][] getGardList() {
		return Arrays.copyOf(gardList, gardList.length);
	}
	public void setGardList(String[][] gardList) {
		this.gardList = gardList;
	}
	
	
}
