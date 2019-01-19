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
				"1. List fleet.\n2. Fly all jets.\n3. View fastest jet. \n4. View jet with longest range. \n5. View all Cargo Jets.\n6. Dogfight!\n7. Add a jet to the Fleet. \n8. Quit this glorious application.");

		choice = kb.nextInt();
		if (choice == 1) {
			for (int i = 0; i < residentJets.length; i++) {
				if (residentJets[i] != null) {

					Jet j = residentJets[i];
					System.out.println((i + 1) + " Model " + j.getModel() + ", Speed " + j.getSpeed() + ", Range "
							+ j.getRange() + ", Price " + j.getPrice());

				}
			}
//		List fleet prints out the model, speed, range, and price of each jet. (There must be at least 5 jets stored when the program starts).
		}

	}
}
