package com.skilldistillery.jets;

public class CombatReady extends FighterJet {

//	Constructors
	public CombatReady(String model, double speed, int range, long price, Pilot pilot) {
		super(model, speed, range, price, pilot);
		this.setSpeed(speed);
		this.setModel(model);
		this.setPilot(pilot);
		this.setPrice(price);
		this.setRange(range);
	}
	public CombatReady(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
//	Methods
	@Override
	public void fly() {
		System.out.println(this.getModel()+" prepped and in the air.  Weapons fully loaded. Where are we hunting?");
		
	}
	@Override
	public void scramble() {
		System.out.println(this.getModel()+" is in the air and engaging.");
	}
}
