package dino;

import java.util.Arrays;
import java.util.Scanner;



class SeaDino extends Def implements Rule {
	Scanner sc = new Scanner(System.in);
	private String[][] seaDinoList;

	public SeaDino() {
		seaDinoList = new String[0][];
	}

	public String[][] getSeaDinoList() {
		return Arrays.copyOf(seaDinoList, seaDinoList.length);
	}

	public void setSeaDinoList(String[][] seaDinoList) {
		this.seaDinoList = seaDinoList;
	}

}
