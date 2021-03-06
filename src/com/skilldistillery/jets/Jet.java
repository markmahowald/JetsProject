package com.skilldistillery.jets;

public abstract class Jet {
//	Private Variables
	private String Model;
	private int range;
	private double speed;
	private long price;
	private Pilot pilot; 
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
		this.Model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		
	}
	public Jet(String model, double speed, int range, long price, Pilot pilot) {
		super();
		this.pilot = pilot;
	}

	// Methods for child classes

	public void fly() {
		System.out.println(this.Model+" is in the air. ");
	}

	public double getSpeedInMach() {
		return (this.speed * 0.00130332);
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

}
