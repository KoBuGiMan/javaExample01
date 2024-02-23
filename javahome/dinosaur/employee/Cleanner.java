package employee;

import java.util.Arrays;

public class Cleanner extends Def2 implements Rule2 {

	private String[][] cleannerList;

	public Cleanner() {
		cleannerList = new String[][] { { "환경미화원", "김미자", "40", "010-2222-3333", "3동 외곽청소" },
				{ "환경미화원", "최정남", "30", "010-3333-4444", "2동 정문청소" } };
	}

	public String[][] getCleannerList() {
		return Arrays.copyOf(cleannerList, cleannerList.length);
	}

	public void setCleannerList(String[][] cleannerList) {
		this.cleannerList = cleannerList;
	}

}
