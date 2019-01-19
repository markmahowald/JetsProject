package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {

		int choice;
		AirField af = new AirField();
		Jet[] residentJets = af.airfield();
		Scanner kb = new Scanner(System.in);

		System.out.println("Welcome to the Air-Field");
		System.out.println("Please make a slection (1-8): ");
		System.out.println(
				"1. List fleet.\n2. Fly all jets.\n3. View fastest jet. \n4. View jet with longest range. \n5. Load all Cargo Jets.\n6. Bogey on the Radar!\n7. Add a jet to the Fleet. \n8. Quit this glorious application.");

		choice = kb.nextInt();
		if (choice == 1) {
			for (int i = 0; i < residentJets.length; i++) {
				if (residentJets[i] != null) {

					Jet j = residentJets[i];
					System.out.println((i + 1) + " Model " + j.getModel() + ", Speed " + j.getSpeed() + "k/ph, Range "
							+ j.getRange() + " k, Price $" + j.getPrice());

				}
			}
		} else if (choice == 2) {
			for (int i = 0; i < residentJets.length; i++) {
				if (residentJets[i] != null) {
					Jet j = residentJets[i];
					j.fly();
				}
			}
		} else if (choice == 3) {
			Jet fastest = residentJets[0];
			int speed = 0;
			for (int i = 0; i < residentJets.length; i++) {
				if (residentJets[i] != null) {
					if (speed < residentJets[i].getSpeed()) {
						speed = (int) residentJets[i].getSpeed();
						fastest = residentJets[i];
					}
				}
			}
			System.out.println(fastest.getModel() + " is the fastest jet right now.\nIts stats are: ");
			System.out.println("Model " + fastest.getModel() + ", Speed " + fastest.getSpeed() + "k/ph, Range "
					+ fastest.getRange() + " km, Price $" + fastest.getPrice());

		} else if (choice == 4) {
			int range = 0;
			Jet furthest = residentJets[0];
			for (int i = 0; i < residentJets.length; i++) {
				if (residentJets[i] != null) {
					if (range < residentJets[i].getRange()) {
						range = residentJets[i].getRange();
						furthest = residentJets[i];
					}
				}
			}
			System.out.println(furthest.getModel() + " is the jet with the longest range right now.\nIts stats are: ");
			System.out.println("Model " + furthest.getModel() + ", Speed " + furthest.getSpeed() + "k/ph, Range "
					+ furthest.getRange() + " km, Price $" + furthest.getPrice());

		} else if (choice == 5) {
			CargoPlane[] cargo = new CargoPlane[residentJets.length];

			for (int i = 0; i < residentJets.length; i++) {
				if (residentJets[i] instanceof CargoPlane) {
					cargo[i] = (CargoPlane) residentJets[i];
				}
			}
			for (int i = 0; i < cargo.length; i++) {
				if (cargo[i] != null) {
					cargo[i].loadCargo();
				}
			}
		} else if (choice == 6) {
			FighterJet[] fighters = new FighterJet[residentJets.length];

			for (int i = 0; i < fighters.length; i++) {
				if (residentJets[i] instanceof FighterJet) {
					fighters[i] = (FighterJet) residentJets[i];
				}

			}
			for (int i = 0; i < fighters.length; i++) {
				if (fighters[i] != null) {
					fighters[i].scramble();
				}
			}
		} else if (choice == 7) {
//			finding the next null space in the residentJets array
			int nextSpace = 0;
			for (int i = 0; i < residentJets.length; i++) {
				if (residentJets[i] == null) {
					nextSpace = i;
					System.out.println(i);
					break;
				}
			}
			System.out.println("");
		}
	}
}
