package dino;

import java.util.Arrays;


public class AllDino {
	public static void main(String[] args) {
		EarthDino earth = new EarthDino();
		SeaDino sea = new SeaDino();
		SkyDino sky = new SkyDino();
		ControlToolDino con = new ControlToolDino();

		con.earthSet();
		con.earthGet();
		con.earthSet();
		con.earthGet();

	}

}
