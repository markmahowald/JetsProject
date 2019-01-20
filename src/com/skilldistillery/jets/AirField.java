package com.skilldistillery.jets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AirField {

	private Jet[] jets() {
		Jet cp = new CargoPlane("Airbus A300", 833.00, 7500, 17500000);
		Jet cc = new CargoCarrier("C-130J", 671.00, 3334, (long) (67300000));
		Jet fj = new FighterJet("Spitfire", 740.00, 1827, (long) (1_002_639));
		Jet cr = new CombatReady("Super Hornet", 1915, 2346, (long) (70_000_000));
		Jet im = new JetImpl("747", 920.00, 13_450, (long) (718_333));

		Jet[] j = new Jet[50];
		j[0] = cp;
		j[1] = cc;
		j[2] = fj;
		j[3] = cr;
		j[4] = im;

		return j;
	}

	public Pilot[] pilots(Jet[] jets) {
		Pilot a = new Pilot("Cornelius Byes");
		Pilot b = new Pilot("Gregory Hedinger");
		Pilot c = new Pilot("Iker Niswender");
		Pilot d = new Pilot("Quentin Stevener");
		Pilot e = new Pilot("Samson Tumolillo");
		Pilot f = new Pilot("Adalyn Agriesti");
		Pilot g = new Pilot("Gisselle Bourgoyne");
		Pilot h = new Pilot("Laura Hausauer");
		Pilot i = new Pilot("Laylah Nimura");
		Pilot j = new Pilot("Marguerite Wair");
		Pilot[] pilotStart = { a, b, c, d, e, f, g, h, i, j };
		
		int k = (int)(Math.random()*10);
		Pilot[] pilotAssignment = new Pilot[pilotStart.length];
		for (int l = 0; l < pilotAssignment.length; l++) {
			if(k+l >=pilotStart.length) {
				k = k-pilotStart.length;
			}
			pilotAssignment[l] = pilotStart[k+l];			
		}
		for (int l = 0; l < jets.length; l++) {
			if(jets[l] != null) {
			jets[l].setPilot(pilotAssignment[l]);
			}
		}
		
		return pilotStart;

//		random assignment generator
//		
//		int k = 9, l;
//		int[] start = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		while (k > 0) {
//			l = (int) (Math.random() * 10);
//
//			boolean result = Arrays.stream(start).distinct((l::equals);)
//			start[k] = (int) (Math.random() * 10);

	}

	public Jet[] airfield() {
		return jets();
	}
}
//Captain 
//Captain 
//Captain 
//Captain 
//Captain 
//Captain 
//Captain 
//Captain 
//Captain 
//Captain 