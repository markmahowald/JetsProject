package com.skilldistillery.jets;

public class AirField {

//	These are the initial jets to populate the air field's array.
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
public Jet[] airfield() {
	return jets();
}
}
