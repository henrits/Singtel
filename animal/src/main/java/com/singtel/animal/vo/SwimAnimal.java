package com.singtel.animal.vo;

public class SwimAnimal extends Animal {
	public SwimAnimal() {
		
	}
	
	public SwimAnimal(String size, String color) {
		super(size, color);
	}
	
	public void walk() {
		System.out.println("I cannot walk");
	}
	
	public void fly() {
		System.out.println("I cannot fly");
	}

	public void sing() {
		System.out.println("I cannot sing");
	}
}
