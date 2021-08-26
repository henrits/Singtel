package com.singtel.animal.vo;

public class Fish extends SwimAnimal {
	private String hobby;

	public Fish() {
		super(false);
	}
	
	public Fish(String size, String color, String hobby) {
		super(size, color, false);

		this.hobby = hobby;
	}

	public void characteristic() {
		System.out.println(getName() + " are " + getSize() + " and " + getColor());
	}

	public void hobby() {
		System.out.println(getName() + " " + hobby);
	}
}
