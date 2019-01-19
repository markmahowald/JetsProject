package com.skilldistillery.jets;

public class CargoPlane extends Jet {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		this.setModel(model);
		this.setSpeed(speed);
		this.setRange(range);
		this.setPrice(price);
	}

	public void loadCargo() {
		System.out.println("Cargo loaded sir. Ready to fly.");
	}

}
