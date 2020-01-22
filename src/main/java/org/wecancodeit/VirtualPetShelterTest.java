package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetShelterTest {
	String result;

	// arrange
	// act
	// assert

	@Test
	public void virtualPetShelterName() {
		// arrange
		VirtualPetShelter petShoppe = new VirtualPetShelter();
		// act
		petShoppe.setShelterName("Pet Shoppe");
		result = petShoppe.getShelterName();
		// assert
		assertEquals("Pet Shoppe", result);
	}

	@Test
	public void petShoppeAnimalCount() {
		// arrange
		VirtualPetShelter animalCount = new VirtualPetShelter();
		// act
		animalCount.setCount(3);
		int result = animalCount.getAnimalCount();
		// assert
		assertEquals(3, result);
	}

	@Test
	public void animalShelterPetNames() {
		VirtualPetShelter animalName1 = new VirtualPetShelter();
		// act
		animalName1.setName1("Java");
		result = animalName1.getAnimalName1();
		// assert
		assertEquals("Java", result);

	}

	@Test
	public void animalShelterPetNames2() {
		VirtualPetShelter animalName2 = new VirtualPetShelter();
		// act
		animalName2.setName2("Git");
		result = animalName2.getAnimalName2();
		// assert
		assertEquals("Git", result);
	}

	@Test
	public void animalShelterPetNames3() {
		VirtualPetShelter animalName3 = new VirtualPetShelter();
		// act
		animalName3.setName3("Bash");
		result = animalName3.getAnimalName3();
		// assert
		assertEquals("Bash", result);
	}

	@Test
	public void JavaPetDescription() {
		VirtualPetShelter javaDescription = new VirtualPetShelter();
		// act
		javaDescription.setJavaDescription("Java is the color of coffee and smells like it too");
		result = javaDescription.getJavaDescription();
		// assert
		assertEquals("Java is the color of coffee and smells like it too", result);

	}

	@Test
	public void GitPetDescription() {
		VirtualPetShelter gitDescription = new VirtualPetShelter();
		// act
		gitDescription.setGitDescription("Git looks like a cat, but is in fact a dog.");
		result = gitDescription.getGitDescription();
		// assert
		assertEquals("Git looks like a cat, but is in fact a dog.", result);

	}

	@Test
	public void BashPetDescription() {
		VirtualPetShelter bashDescription = new VirtualPetShelter();
		// act
		bashDescription.setBashDescription("Bash is black and white and full of spunk.");
		result = bashDescription.getBashDescription();
		// assert
		assertEquals("Bash is black and white and full of spunk.", result);

	}

	@Test
	public void shouldHaveHungerPet() {
		VirtualPetShelter animalHunger = new VirtualPetShelter();
		// act
		animalHunger.setAnimalHunger(10);
		int result = animalHunger.getAnimalHunger();
		// assert
		assertEquals(10, result);
	}

	@Test
	public void shouldHaveThirstPet() {
		VirtualPetShelter animalThirst = new VirtualPetShelter();
		// act
		animalThirst.setAnimalThirst(10);
		int result = animalThirst.getAnimalThirst();
		// assert
		assertEquals(10, result);
	}

	@Test
	public void shouldHaveBoredomPet() {
		VirtualPetShelter animalBoredom = new VirtualPetShelter();
		// act
		animalBoredom.setAnimalBoredom(10);
		int result = animalBoredom.getAnimalBoredom();
		// assert
		assertEquals(10, result);
		
	}
		
	}
	
	
	
	
		