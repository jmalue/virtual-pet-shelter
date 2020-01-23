package org.wecancodeit;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		{
			VirtualPetShelter myPetShelter = new VirtualPetShelter();

			myPetShelter.getAnimalCount();
			myPetShelter.getAnimalName1();
			myPetShelter.getAnimalName2();
			myPetShelter.getAnimalName3();
			myPetShelter.getJavaDescription();
			myPetShelter.getGitDescription();
			myPetShelter.getBashDescription();
			myPetShelter.getAnimalBoredom();
			myPetShelter.getAnimalHunger();
			myPetShelter.getAnimalThirst();
			myPetShelter.getfeedAllPets();
			myPetShelter.getwaterAllPets();
			myPetShelter.getPetTick();
			
			while (true) {
				System.out.println("Welcome to " + myPetShelter.getShelterName()
						+ "\nWould you like to volunteer or adopt a pet today?");
				System.out.println("1. Volunteer " + "\n2. Adopt" +"\n3. Receive New Pet");

				String optionEntered = input.nextLine();
				{
					if (optionEntered.contentEquals("1")) {
						System.out.println("You are now a volunteer" + "\nHere are the stats on the animals in the shelter.");
						System.out.println(myPetShelter.getAnimalName1() + "\nHunger = " + (myPetShelter.getAnimalHunger() + "\nThirst = "
										+ ((myPetShelter.getAnimalThirst() - 1) + "\nBoredom = " + (myPetShelter.getAnimalBoredom() - 2))));
						System.out.println(myPetShelter.getAnimalName2() + "\nHunger = " + (myPetShelter.getAnimalHunger() - 2) + "\nThirst = " + ((myPetShelter.getAnimalThirst() - 1) + "\nBoredom = "
										+ (myPetShelter.getAnimalBoredom() - 3)));
						System.out.println(myPetShelter.getAnimalName3() + "\nHunger = " + (myPetShelter.getAnimalHunger() - 4)	+ "\nThirst = " + ((myPetShelter.getAnimalThirst() - 4) + "\nBoredom = "
										+ (myPetShelter.getAnimalBoredom() - 4)));
						System.out.println("What would you like to do?");
						System.out.println("Feed All Pets" + "\nWater All Pets" + "\nPlay");

						optionEntered = input.nextLine();
					}
					if (optionEntered.contentEquals("Feed All Pets")) {
						myPetShelter.getfeedAllPets();
						System.out.println("You have chosen to feed " + myPetShelter.getAnimalName1() + ", " + myPetShelter.getAnimalName2() + " and " +  myPetShelter.getAnimalName3());

						optionEntered = input.nextLine();

					} else if (optionEntered.contentEquals("Water All Pets")) {
						myPetShelter.getfeedAllPets();
						System.out.println("You have chosen to give water to " + myPetShelter.getAnimalName1() + ", " +  myPetShelter.getAnimalName2() + " and " +  myPetShelter.getAnimalName3());
						
						optionEntered = input.nextLine();

					} else if (optionEntered.contentEquals("Play")) {
						System.out.println("Which pet would you like to play with?");
						System.out.println("Java" + "\nGit" + "\nBash");

						optionEntered = input.nextLine();

					} if (optionEntered.contentEquals("Java")) {
						myPetShelter.getAnimalBoredom();
						System.out.println("You have chosen to play with " + myPetShelter.getAnimalName1());

					} else if (optionEntered.contentEquals("Git")) {
						myPetShelter.getAnimalBoredom();
						System.out.println("You have chosen to play with " + myPetShelter.getAnimalName2());

					} else if (optionEntered.contentEquals("Bash")) {
						myPetShelter.getAnimalBoredom();
						System.out.println("You have chosen to play with " + myPetShelter.getAnimalName3());

						optionEntered = input.nextLine();

					} if (optionEntered.contentEquals("2")) {
						System.out.println("You chose to adopt" + "\nWhich animal are you interested in?");

						System.out.println("4.Java " + myPetShelter.getJavaDescription() + "\n5.Git "
								+ myPetShelter.getGitDescription() + "\n6.Bash " + myPetShelter.getBashDescription());

						optionEntered = input.nextLine();

					} if (optionEntered.contentEquals("4")) {
						System.out.println("You have chosen " + myPetShelter.getAnimalName1() + ". Enjoy him and treat him well.");

					} else if (optionEntered.contentEquals("5")) {
						System.out.println("You have chosen " + myPetShelter.getAnimalName2() + ". Enjoy him and treat him well.");

					} else if (optionEntered.contentEquals("6")) {
						System.out.println("You have chosen " + myPetShelter.getAnimalName3() + ". Enjoy him and treat him well.");

					} if (optionEntered.contentEquals("3")) {
						System.out.println("You have chosen to receive a new pet into the shelter.");
					 
					myPetShelter.getPetTick();
					}
				}
			}
		}
	}
}