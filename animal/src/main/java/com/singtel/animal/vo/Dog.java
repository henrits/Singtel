package com.singtel.animal.vo;

public class Dog extends WalkAnimal {
	public Dog() {
		super(true, true);
	}

	public void say() {
		System.out.println("Woof, woof");
	}
}
