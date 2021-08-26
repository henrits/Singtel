package com.singtel.animal.vo;

import com.singtel.animal.enums.Gender;

public class WalkAnimal extends Animal {
	public WalkAnimal() {

	}

	public WalkAnimal(boolean canSay, boolean canSound) {
		super(true, false, false, canSay, false, canSound);
	}

	public WalkAnimal(Gender gender, boolean canSay, boolean canSound) {
		super(gender, true, false, false, canSay, false, canSound);
	}

	public void fly() {
		System.out.println("I cannot fly");
	}

	public void sing() {
		System.out.println("I cannot sing");
	}

	public void swim() {
		System.out.println("I cannot swim");
	}
}
