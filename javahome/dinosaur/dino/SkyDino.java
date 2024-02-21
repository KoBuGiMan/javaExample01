package dino;

import java.util.Arrays;
import java.util.Scanner;



class SkyDino extends Def implements Rule {
	Scanner sc = new Scanner(System.in);
	private String[][] skyDinoList;

	public SkyDino() {
		skyDinoList = new String[0][];
	}

	public String[][] getSkyDinoList() {
		return Arrays.copyOf(skyDinoList, skyDinoList.length);
	}

	public void setSkyDinoList(String[][] skyDinoList) {
		this.skyDinoList = skyDinoList;
	}

}
