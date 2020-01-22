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

	public void setShelterName(String string) {
		this.shelterName = string;
	}

	public String getShelterName() {
		return shelterName;
	}

	public void setCount(int animalCount) {

	}

	public int getAnimalCount() {
		return animalCount;
	}

	public String getJavaDescription() {
		return javaDescription;
	}

	public void setJavaDescription(String string) {
		this.javaDescription = string;

	}

	public String getGitDescription() {
		return gitDescription;
	}

	public void setGitDescription(String string) {
		this.gitDescription = string;

	}

	public String getBashDescription() {
		return bashDescription;
	}

	public void setBashDescription(String string) {
		this.bashDescription = string;

	}

	public void setAnimalHunger(int hunger) {
		this.animalHunger = (10);

	}

	public int getAnimalHunger() {
		return 10;
	}

	public int getAnimalThirst() {
		return 10;
	}

	public void setAnimalThirst(int i) {
		this.animalThirst = (10);

	}

	public void setAnimalBoredom(int i) {
		this.animalBoredom = (10);

	}

	public int getAnimalBoredom() {
		return 10;
	}

	public void setName1(String string) {
		this.animalName1 = string;

	}

	public String getAnimalName1() {
		return animalName1;
	}

	public void setName2(String string) {
		this.animalName2 = string;
	}

	public String getAnimalName2() {
		return animalName2;
	}

	public void setName3(String string) {
		this.animalName3 = string;
	}

	public String getAnimalName3() {
		return animalName3;
	}
}
