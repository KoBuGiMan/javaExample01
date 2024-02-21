package employee;

import java.util.Arrays;

public class Cleanner extends Def2 implements Rule2{
	
	private String[][] cleannerList;
	
	public Cleanner() {
		cleannerList = new String[0][];
	}

	public String[][] getCleannerList() {
		return Arrays.copyOf(cleannerList, cleannerList.length);
	}

	public void setCleannerList(String[][] cleannerList) {
		this.cleannerList = cleannerList;
	}


}
