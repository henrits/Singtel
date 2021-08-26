package com.singtel.animal.vo;

public class SwimAnimal extends Animal {
	private boolean goodSwimmer;
	
	public SwimAnimal() {
		
	}
	
	public SwimAnimal(boolean canSound) {
		super(false, false, false, false, true, canSound);
	}
	
	public SwimAnimal(boolean goodSwimmer, boolean canSound) {
		super(false, false, false, false, true, canSound);
		this.goodSwimmer = goodSwimmer;
	}

	public SwimAnimal(String size, String color, boolean canSound) {
		super(size, color, false, false, false, false, true, canSound);
	}
	
	public boolean isGoodSwimmer() {
		return goodSwimmer;
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
