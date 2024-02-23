package dino;

import java.util.Arrays;
import java.util.Scanner;


public class EarthDino extends Def implements Rule{
	Scanner sc = new Scanner(System.in);

	private String[][] earthDinoList;

	public EarthDino() {
		earthDinoList = new String[][] {{"티라노사우루스","쩝쩝이","육식","대형"},{"랩터","얍샵이","잡식","소형"},{"트리케라톱스","쿵쿵이","초식","중형"}};

	}

	public String[][] getEarthDinoList() {
		return Arrays.copyOf(earthDinoList, earthDinoList.length);
	}

	public void setEarthDinoList(String[][] earthDinoList) {
		this.earthDinoList = earthDinoList;
	}
	
}