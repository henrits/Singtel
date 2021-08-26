package com.singtel.animal.vo;

public class Duck extends WalkAnimal {
	public Duck() {
		super(true, true);
	}

	public void say() {
		System.out.println("Quack, quack");
	}
}
