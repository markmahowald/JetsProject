package com.skilldistillery.jets;

public class JetImpl extends Jet {

//	Constructors
	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		this.setModel(model);
		this.setSpeed(speed);
		this.setRange(range);
		this.setPrice(price);
	}

}
