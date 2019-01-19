package com.skilldistillery.jets;

public class CombatReady extends FighterJet {

//	Constructors
	public CombatReady(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		this.setModel(model);
		this.setSpeed(speed);
		this.setRange(range);
		this.setPrice(price);
	}
	
//	Methods
	@Override
	public void fly() {
		System.out.println("Prepped and ready to fly sir.  Where are we hunting?");
		
	}
}
