package com.singtel.animal.vo;

import com.singtel.animal.enums.Gender;

public class Chicken extends WalkAnimal {
	public Chicken() {
		super(true, true);
	}

	public Chicken(Gender gender) {
		super(gender, true, true);
	}

	public void say() {
		if (getGender() == Gender.Male) {
			System.out.println("Cock-a-doodle-doo");
		} else {
			System.out.println("Cluck, cluck");
		}
	}
}