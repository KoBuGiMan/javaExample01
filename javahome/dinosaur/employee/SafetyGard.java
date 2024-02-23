package employee;

import java.util.Arrays;

public class SafetyGard extends Def2 implements Rule2 {

	private String[][] safetyGardList;

	public SafetyGard() {
		safetyGardList = new String[][] { { "안전관리원", "박현대", "65", "010-9999-3333", "5동 안전점검" },
				{ "안전관리원", "최기아", "25", "010-5555-4444", "각 동의 안전등급 갱신" } };
	}

	public String[][] getSafetyGardList() {
		return Arrays.copyOf(safetyGardList, safetyGardList.length);
	}

	public void setSafetyGardList(String[][] safetyGardList) {
		this.safetyGardList = safetyGardList;
	}

}
