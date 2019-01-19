package com.skilldistillery.jets;

public class FighterJet extends Jet {
//	Constructor
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		this.setModel(model);
		this.setSpeed(speed);
		this.setRange(range);
		this.setPrice(price);
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