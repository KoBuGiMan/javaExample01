package dino;

import java.util.Arrays;
import java.util.Scanner;


public class EarthDino extends Def implements Rule{
	Scanner sc = new Scanner(System.in);

	private String[][] earthDinoList;

	public EarthDino() {
		earthDinoList = new String[0][];

	}

	public String[][] getEarthDinoList() {
		return Arrays.copyOf(earthDinoList, earthDinoList.length);
	}

	public void setEarthDinoList(String[][] earthDinoList) {
		this.earthDinoList = earthDinoList;
	}
	
}