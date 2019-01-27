package com.skilldistillery.jets;

public class CargoCarrier extends CargoPlane {

	public CargoCarrier(String model, double speed, int range, long price, Pilot pilot) {
		super(model, speed, range, price, pilot);
		this.setSpeed(speed);
		this.setModel(model);
		this.setPilot(pilot);
		this.setPrice(price);
		this.setRange(range);
	}
	public CargoCarrier(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void loadCargo() {
		System.out.println(this.getModel()+" reporting cargo loaded.  Id like to see a regular cargo plane carry this much");
	}

}
