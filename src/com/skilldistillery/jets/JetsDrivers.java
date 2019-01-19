package com.skilldistillery.jets;

public class JetsDrivers {
	public void menuStart() {
		System.out.println();
		System.out.println("Please make a slection (1-8): ");
		System.out.println(
				"1. List fleet.\n2. Fly all jets.\n3. View fastest jet. \n4. View jet with longest range. \n5. Load all Cargo Jets.\n6. Bogey on the Radar!\n7. Add a jet to the Fleet. \n8. Quit this glorious application.");
		
	}

	public void choiceSwitch() {
		
	}
	
	public void choiceOne(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {

				Jet j = jets[i];
				System.out.println((i + 1) + " Model " + j.getModel() + ", Speed " + j.getSpeed() + "k/ph, Range "
						+ j.getRange() + " k, Price $" + j.getPrice());

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

	public void choiceThree(Jet[] jets) {
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

	public void choiceFour(Jet[] jets) {
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

	public void choiceFive(Jet[] jets) {
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

	public void choiceSix(Jet[] jets) {
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

	public void newJetCreation(Jet[] jets,String nextModel, double nextSpeed, int nextRange, long nextPrice, int choice, int nextSpace) {
		switch (choice) {
		case 1:
			Jet f = new FighterJet(nextModel, nextSpeed, nextRange, nextPrice);
			jets[nextSpace] = f;
			break;
		case 2:
			Jet fc = new CombatReady(nextModel, nextSpeed, nextRange, nextPrice);
			jets[nextSpace] = fc;
			break;
		case 3:
			Jet cp = new CargoPlane(nextModel, nextSpeed, nextRange, nextPrice);
			jets[nextSpace] = cp;
			break;
		case 4:
			Jet cc = new CargoCarrier(nextModel, nextSpeed, nextRange, nextPrice);
			jets[nextSpace] = cc;
			break;
		case 5:
			Jet impl = new JetImpl(nextModel, nextSpeed, nextRange, nextPrice);
			jets[nextSpace] = impl;
			break;
		}
	}

}
