package com.skilldistillery.jets;

public abstract class Jet {
//	Private Variables
	private String Model;
	private int range;
	private double speed;
	private long price;

//	Getters & Setters for private variables.
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

//	Constructors
	public Jet(String model, double speed, int range, long price) {

	}

	// Methods for child classes

	public void fly() {
	}

	public double getSpeedInMach() {
		return (this.speed * 0.001303);
	}

}
