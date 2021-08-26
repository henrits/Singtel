package com.singtel.animal.vo;

public class Frog extends Animal {
	public Frog() {
		super(false, false, false, true, true, false);
	}

	public void say() {
		System.out.println("Croak");
	}
}
