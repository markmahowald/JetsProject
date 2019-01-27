package com.skilldistillery.jets;

public class JetImpl extends Jet {

//	Constructors
	public JetImpl(String model, double speed, int range, long price, Pilot pilot) {
		super(model, speed, range, price, pilot);
		this.setSpeed(speed);
		this.setModel(model);
		this.setPilot(pilot);
		this.setPrice(price);
		this.setRange(range);
	}
	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

}
