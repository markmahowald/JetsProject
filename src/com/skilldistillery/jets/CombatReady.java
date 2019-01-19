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
		System.out.println(this.getModel()+" prepped and in the air.  Weapons fully loaded. Where are we hunting?");
		
	}
	@Override
	public void scramble() {
		System.out.println(this.getModel()+" is in the air and engaging.");
	}
}
