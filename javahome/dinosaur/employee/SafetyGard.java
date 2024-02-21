package employee;

import java.util.Arrays;

public class SafetyGard extends Def2 implements Rule2{
	
	private String[][] safetyGardList;
	
	public SafetyGard() {
		safetyGardList = new String[0][];
	}

	public String[][] getSafetyGardList() {
		return Arrays.copyOf(safetyGardList, safetyGardList.length);
	}

	public void setSafetyGardList(String[][] safetyGardList) {
		this.safetyGardList = safetyGardList;
	}
	

}
