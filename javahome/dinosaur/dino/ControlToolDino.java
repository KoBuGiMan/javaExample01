package dino;

import java.util.Arrays;

public class ControlToolDino {
	EarthDino earth = new EarthDino();
	SeaDino sea = new SeaDino();
	SkyDino sky = new SkyDino();
	Def def = new Def();
	
	void earthSet() {
		earth.setEarthDinoList(earth.setDinoList(earth.getEarthDinoList()));
	}
	
	void earthGet() {
		System.out.println(Arrays.deepToString(earth.getEarthDinoList()));
	}
	void seaSet() {
		sea.setSeaDinoList(earth.setDinoList(sea.getSeaDinoList()));
	}
	void seaGet() {
		System.out.println(Arrays.deepToString(sea.getSeaDinoList()));
	}
	void skySet() {
		sky.setSkyDinoList(sky.setDinoList(sky.getSkyDinoList()));
	}
	void skyGet() {
		System.out.println(Arrays.deepToString(sky.getSkyDinoList()));
	}

}
