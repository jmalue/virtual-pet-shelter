package org.wecancodeit;

public class VirtualPets {

	private int thirst = 0;
	private int hunger = 0;
	private int boredom = 0;
	private int appearance = 0;
	private int health = 0;
	private int energy = 0;
	private String petsName = "";
	private String petDescription = "";
	private String animalShelterTick;

	public VirtualPets (int thirst, int hunger, int boredom, int appearance, int health, int energy, String petsName) {
		this.thirst = thirst;
		this.hunger = hunger;
		

	}

	public VirtualPets() {

	}

	public VirtualPets(int thirst, int hunger, int bordom) {//math random constructor
		this.thirst = thirst++;
		this.hunger = hunger++;
		this.boredom = bordom++;
	}

	}


