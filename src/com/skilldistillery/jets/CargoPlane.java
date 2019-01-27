package com.skilldistillery.jets;

public class CargoPlane extends Jet {

	public CargoPlane(String model, double speed, int range, long price, Pilot pilot) {
		super(model, speed, range, price, pilot);
		this.setSpeed(speed);
		this.setModel(model);
		this.setPilot(pilot);
		this.setPrice(price);
		this.setRange(range);
	}
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void loadCargo() {
		System.out.println(this.getModel()+" reporting cargo loaded sir. Ready to fly.");
	}

}
