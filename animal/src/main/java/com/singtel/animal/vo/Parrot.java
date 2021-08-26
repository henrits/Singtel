package com.singtel.animal.vo;

import com.singtel.animal.enums.Animals;

public class Parrot extends Bird {
	private Animals liveWithAnimal;

	public Parrot(Animals liveWithAnimal) {
		this.liveWithAnimal = liveWithAnimal;
	}

	public void say() {
		try {
			Animal animal = (Animal) Class.forName("com.singtel.animal.vo." + liveWithAnimal.toString()).newInstance();
			animal.say();
		} catch (Exception e) {
			System.out.println("Cannot find the animal");
		}
	}
}
