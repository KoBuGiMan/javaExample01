package employee;

import java.util.Arrays;

public class OfficeJob extends Def2 implements Rule2 {

	private String[][] officeJobList;

	public OfficeJob() {
		officeJobList = new String[][] { { "사무원", "김옥자", "40", "010-8888-3333", "공룡 리스트 엑셀화작업" },
				{ "사무원", "김지혜", "30", "010-7777-4444", "직원 휴가조정" } };
	}

	public String[][] getOfficeJobList() {
		return Arrays.copyOf(officeJobList, officeJobList.length);
	}

	public void setOfficeJobList(String[][] officeJobList) {
		this.officeJobList = officeJobList;
	}

}
