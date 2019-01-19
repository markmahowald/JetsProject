package com.skilldistillery.jets;

public class CargoCarrier extends CargoPlane {

	public CargoCarrier(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		this.setModel(model);
		this.setSpeed(speed);
		this.setRange(range);
		this.setPrice(price);
	}
	
	@Override
	public void loadCargo() {
		System.out.println("Full cargo loaded.  Id like to see a regular cargo plane carry this much");
	}

}
