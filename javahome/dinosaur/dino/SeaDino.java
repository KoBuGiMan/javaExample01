package dino;

import java.util.Arrays;
import java.util.Scanner;



class SeaDino extends Def implements Rule {
	Scanner sc = new Scanner(System.in);
	private String[][] seaDinoList;

	public SeaDino() {
		seaDinoList = new String[][]{{"모사사우루스","룡룡이","육식","대형"},{"플레시오사우루스","첨벙이","초식","중형"},{"크로노사우루스","축축이","잡식","소형"}};
		
	}

	public String[][] getSeaDinoList() {
		return Arrays.copyOf(seaDinoList, seaDinoList.length);
	}

	public void setSeaDinoList(String[][] seaDinoList) {
		this.seaDinoList = seaDinoList;
	}

}
