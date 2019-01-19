package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {

		JetsDrivers driver = new JetsDrivers();
		int choice;
		AirField af = new AirField();
		Jet[] residentJets = af.airfield();
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Air-Field");
		while (true) {
			
			driver.menuStart();

			choice = kb.nextInt();
			
			if (choice == 1) {
				driver.choiceOne(residentJets);

			} else if (choice == 2) {
				driver.choiceTwo(residentJets);

			} else if (choice == 3) {
				driver.choiceThree(residentJets);
			} else if (choice == 4) {
				driver.choiceFour(residentJets);
			} else if (choice == 5) {
				driver.choiceFive(residentJets);
			} else if (choice == 6) {
				driver.choiceSix(residentJets);
			} else if (choice == 7) {
				int nextSpace = driver.nextNullInJetArray(residentJets), nextRange;
				String nextModel = "";
				double nextSpeed;
				long nextPrice;

				System.out.println(
						"Congradulations on your purchase of a new jet!\nWhat type is it? This air field can house the following:");
				System.out.println(
						"1. Vintage Fighter.\n2. Modern combat ready Fighter\n3. Cargo Plane. \n4. A large Cargo Carrier. \n5. A boring regular jet");
				choice = kb.nextInt();
				System.out.println("What model is it?");
				nextModel = kb.next();
				System.out.println("How far can you fly it?");
				nextRange = kb.nextInt();
				System.out.println("What is it's top speed?");
				nextSpeed = kb.nextDouble();
				System.out.println("For tax reasons, how much did it cost you?");
				nextPrice = kb.nextLong();
				System.out.println("Processing");
				System.err.println("");
				System.out.println("");

				driver.newJetCreation(residentJets, nextModel, nextSpeed, nextRange, nextPrice, choice, nextSpace);

			} else if (choice == 8) {
				System.out.println("Good Bye!");
				System.exit(0);
			}
			else {
				System.out.println("That was not a valid choice.");
				System.out.println();
			}
		}
	}
}
