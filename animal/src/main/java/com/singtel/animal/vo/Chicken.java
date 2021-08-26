package com.singtel.animal.vo;

import com.singtel.animal.enums.Gender;

public class Chicken extends Animal {
	public Chicken() {

	}

	public Chicken(Gender gender) {
		super(gender);
	}

	public void say() {
		if (getGender() == Gender.Male) {
			System.out.println("Cock-a-doodle-doo");
		} else {
			System.out.println("Cluck, cluck");
		}
	}
}