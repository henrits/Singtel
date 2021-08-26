package com.singtel.animal.vo;

import com.singtel.animal.enums.Gender;

public class Animal {
	private Gender gender;
	
	public Animal() {
		
	}
	
	public Animal(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
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
}