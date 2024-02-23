package employee;

import java.util.Arrays;

public class Gard extends Def2 implements Rule2 {

	private String[][] gardList;

	public Gard() {
		gardList = new String[][] { { "경비원", "김복남", "62", "010-2222-4444", "공원 정문담당" },
				{ "경비원", "이지훈", "20", "010-3333-4444", "공원 후문담당" } };
	}

	public String[][] getGardList() {
		return Arrays.copyOf(gardList, gardList.length);
	}

	public void setGardList(String[][] gardList) {
		this.gardList = gardList;
	}

}
