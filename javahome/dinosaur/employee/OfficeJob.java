package employee;

import java.util.Arrays;

public class OfficeJob extends Def2 implements Rule2{
	
	private String[][] officeJobList;
	public OfficeJob(){
		officeJobList = new String[0][];
	}
	public String[][] getOfficeJob() {
		return Arrays.copyOf(officeJobList, officeJobList.length);
	}
	public void setOfficeJob(String[][] officeJobList) {
		this.officeJobList = officeJobList;
	}
	

}
