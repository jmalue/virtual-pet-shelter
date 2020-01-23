package org.wecancodeit;

public class VirtualPetShelter {
	private String shelterName;
	private int animalCount = 3;
	private String animalName1;
	private String animalName2;
	private String animalName3;
	private String javaDescription;
	private String gitDescription;
	private String bashDescription;
	private int animalHunger;
	private int animalThirst;
	private int animalBoredom;
	private String PetTick;

	public void setShelterName(String string) {
		this.shelterName = "Pet Shoppe";
	}

	public String getShelterName() {
		return "Pet Shoppe";
	}

	public void setCount(int animalCount) {

	}

	public int getAnimalCount() {
		return animalCount;
	}

	public String getJavaDescription() {
		return "is the color of coffee and smells like it too.";
	}

	public void setJavaDescription(String string) {
		this.javaDescription = "is the color of coffee and smells like it too.";

	}

	public String getGitDescription() {
		return "looks like a cat, but is in fact a dog.";
	}

	public void setGitDescription(String string) {
		this.gitDescription = "looks like a cat, but is in fact a dog.";

	}

	public String getBashDescription() {
		return "is black and white and full of spunk.";
	}

	public void setBashDescription(String string) {
		this.bashDescription = "is black and white and full of spunk.";

	}

	public void setAnimalHunger(int i) {
		this.animalHunger = (10);

	}

	public int getAnimalHunger() {
		return 10;
	}

	public int getAnimalThirst() {
		return 10;
	}

	public void setAnimalThirst(int j) {
		this.animalThirst = (10);

	}

	public void setAnimalBoredom(int k) {
		this.animalBoredom = (10);

	}

	public int getAnimalBoredom() {
		return 10;
	}

	public void setName1(String string) {
		this.animalName1 = "Java";

	}

	public String getAnimalName1() {
		return "Java";
	}

	public void setName2(String string) {
		this.animalName2 = "Git";
	}

	public String getAnimalName2() {
		return "Git";
	}

	public void setName3(String string) {
		this.animalName3 = "Bash";
	}

	public String getAnimalName3() {
		return "Bash";
	}

	public void setPetTick(String string) {
		this.animalBoredom = animalBoredom++;
		this.animalThirst = animalThirst++;
		this.animalHunger = animalHunger++;
	}

	public String getPetTick() {
		return "";
	}

	public void setfeedAllPets(String string) {
		this.animalBoredom = animalBoredom--;
		this.animalThirst = animalThirst++;
		this.animalHunger = animalHunger--;

	}

	public String getfeedAllPets() {
		return "";

	}

	public void setwaterAllPets(String result) {
		this.animalBoredom = animalBoredom--;
		this.animalThirst = animalThirst--;

	}

	public String getwaterAllPets() {
		return "";
	}
}
