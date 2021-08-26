package com.singtel.animal.vo;

public class Cat extends WalkAnimal {
	public Cat() {
		super(true, true);
	}

	public void say() {
		System.out.println("Me ow");
	}
}
