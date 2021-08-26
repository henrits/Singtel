package com.singtel.animal.vo;

public class SwimAnimal extends Animal {
	private boolean goodSwimmer;
	
	public SwimAnimal() {
		
	}
	
	public SwimAnimal(boolean goodSwimmer) {
		this.goodSwimmer = goodSwimmer;
	}
	
	public boolean isGoodSwimmer() {
		return goodSwimmer;
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
