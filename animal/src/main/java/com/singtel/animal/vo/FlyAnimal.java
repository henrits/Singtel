package com.singtel.animal.vo;

public class FlyAnimal extends Animal {
	public FlyAnimal() {
		super(true, true, true, true, false, true);
	}
	
	public void swim() {
		System.out.println("I cannot swim");
	}
}
