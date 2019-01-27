package com.skilldistillery.jets;

public class FighterJet extends Jet {
//	Constructor
	public FighterJet(String model, double speed, int range, long price, Pilot pilot) {
		super(model, speed, range, price, pilot);
		this.setSpeed(speed);
		this.setModel(model);
		this.setPilot(pilot);
		this.setPrice(price);
		this.setRange(range);
				
				
	}
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
//	Methods
	@Override
	public void fly() {
		System.out.println(this.getModel() + " is in the air, but not combat ready. ");
	}
	public void scramble() {
		System.out.print(this.getModel()+" scrambling to intercept,");
		System.err.println(" but we are very not combat ready.");
	}
}