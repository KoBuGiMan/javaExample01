package dino;

import java.util.Arrays;
import java.util.Scanner;



class SkyDino extends Def implements Rule {
	Scanner sc = new Scanner(System.in);
	private String[][] skyDinoList;

	public SkyDino() {
		skyDinoList = new String[][] {{"프테라노돈","펄럭이","잡식","중형"},{"케찰코아틀루스","짱짱이","육식","대형"},{"스카포그나투스","총총이","초식","소형"}};
	}

	public String[][] getSkyDinoList() {
		return Arrays.copyOf(skyDinoList, skyDinoList.length);
	}

	public void setSkyDinoList(String[][] skyDinoList) {
		this.skyDinoList = skyDinoList;
	}

}
