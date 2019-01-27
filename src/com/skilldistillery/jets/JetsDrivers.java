package com.skilldistillery.jets;

public class JetsDrivers {
	public void menuStart() {
		System.out.println();
		System.out.println("Please make a slection (1-8): ");
		System.out.println(
				"1. List fleet.\n2. Fly all jets.\n3. Fly a specific plane.\n4. View fastest jet. \n5. View jet with longest range. \n6. Load all Cargo Jets.\n7. Bogey on the Radar!\n8. Add a jet to the Fleet. \n9. Quit this glorious application.");

	}

	public void choiceSwitch() {

	}

	public void choiceOne(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {

				Jet j = jets[i];
				System.out.println((i + 1) + " Model " + j.getModel() + ", Speed " + j.getSpeed() + "mph, Range "+ j.getRange() + " k, Price $" + j.getPrice() + " & Pilot " + j.getPilot().getName());

			}
		}
	}

	public void choiceTwo(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				Jet j = jets[i];
				j.fly();
			}
		}
	}

		

	public void choiceFour(Jet[] jets) {
		Jet fastest = jets[0];
		int speed = 0;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (speed < jets[i].getSpeed()) {
					speed = (int) jets[i].getSpeed();
					fastest = jets[i];
				}
			}
		}
		System.out.println(fastest.getModel() + " is the fastest jet right now.\nIts stats are: ");
		System.out.println("Model " + fastest.getModel() + ", Speed " + fastest.getSpeed() + "k/ph, Range "
				+ fastest.getRange() + " km, Price $" + fastest.getPrice());

	}

	public void choiceSix(Jet[] jets) {

		CargoPlane[] cargo = new CargoPlane[jets.length];

		for (int i = 0; i < jets.length; i++) {
			if (jets[i] instanceof CargoPlane) {
				cargo[i] = (CargoPlane) jets[i];
			}
		}
		for (int i = 0; i < cargo.length; i++) {
			if (cargo[i] != null) {
				cargo[i].loadCargo();
			}
		}
	}

	public void choiceFive(Jet[] jets) {
		int range = 0;
		Jet furthest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (range < jets[i].getRange()) {
					range = jets[i].getRange();
					furthest = jets[i];
				}
			}
		}
		System.out.println(furthest.getModel() + " is the jet with the longest range right now.\nIts stats are: ");
		System.out.println("Model " + furthest.getModel() + ", Speed " + furthest.getSpeed() + "k/ph, Range "
				+ furthest.getRange() + " km, Price $" + furthest.getPrice());
	}

	public void choiceSeven(Jet[] jets) {
		FighterJet[] fighters = new FighterJet[jets.length];

		for (int i = 0; i < fighters.length; i++) {
			if (jets[i] instanceof FighterJet) {
				fighters[i] = (FighterJet) jets[i];
			}

		}
		for (int i = 0; i < fighters.length; i++) {
			if (fighters[i] != null) {
				fighters[i].scramble();
			}
		}
	}

	public int nextNullInJetArray(Jet[] jets) {
		int nextSpace = 0;

		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				nextSpace = i;
				return nextSpace;
			}
		}
		return nextSpace;
	}

	public Jet newJetCreation(Jet[] jets, String nextModel, double nextSpeed, int nextRange, long nextPrice,
			int choice, int nextSpace, Pilot pilot, int nextJet) {
		switch (nextJet) {
		case 1:
			Jet f = new FighterJet(nextModel, nextSpeed, nextRange, nextPrice, pilot);
			jets[nextSpace] = f;
			return f;
		case 2:
			Jet fc = new CombatReady(nextModel, nextSpeed, nextRange, nextPrice, pilot);
			jets[nextSpace] = fc;
			return fc;
		case 3:
			Jet cp = new CargoPlane(nextModel, nextSpeed, nextRange, nextPrice, pilot);
			jets[nextSpace] = cp;
			return cp;
		case 4:
			Jet cc = new CargoCarrier(nextModel, nextSpeed, nextRange, nextPrice, pilot);
			jets[nextSpace] = cc;
			return cc;
		case 5:
			Jet impl = new JetImpl(nextModel, nextSpeed, nextRange, nextPrice, pilot);
			jets[nextSpace] = impl;
			return impl;
		}
		return null;
	}

}
