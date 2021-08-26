package com.singtel.animal.vo;

import com.singtel.animal.enums.Gender;

public class Animal {
	private Gender gender;
	private String size;
	private String color;
	private boolean canWalk;
	private boolean canFly;
	private boolean canSing;
	private boolean canSay;
	private boolean canSwim;
	private boolean canSound;
	
	public Animal() {
		
	}
	
	public Animal(boolean canWalk, boolean canFly, boolean canSing, boolean canSay, boolean canSwim, boolean canSound) {
		this.canWalk = canWalk;
		this.canFly = canFly;
		this.canSing = canSing;
		this.canSay = canSay;
		this.canSwim = canSwim;
		this.canSound = canSound;
	}
	
	public Animal(Gender gender, boolean canWalk, boolean canFly, boolean canSing, boolean canSay, boolean canSwim, boolean canSound) {
		this.canWalk = canWalk;
		this.canFly = canFly;
		this.canSing = canSing;
		this.canSay = canSay;
		this.canSwim = canSwim;
		this.canSound = canSound;
		this.gender = gender;
	}
	
	public Animal(String size, String color, boolean canWalk, boolean canFly, boolean canSing, boolean canSay, boolean canSwim, boolean canSound) {
		this.canWalk = canWalk;
		this.canFly = canFly;
		this.canSing = canSing;
		this.canSay = canSay;
		this.canSwim = canSwim;
		this.canSound = canSound;
		this.size = size;
		this.color = color;
	}
	
	public String getName() {
		return getClass().getSimpleName();
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public boolean isCanSay() {
		return canSay;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public boolean isCanSound() {
		return canSound;
	}

	public void walk() {
		System.out.println("I am walking");
	}
	
	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}
	
	public void say() {
		System.out.println("I am saying");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void sound() {
		System.out.println("I have sound");
	}
}