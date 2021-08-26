package com.singtel.animal.vo;

import com.singtel.animal.enums.ButterflyStage;

public class Butterfly extends FlyAnimal {
	private ButterflyStage stage;
	
	public Butterfly() {
		
	}
	
	public Butterfly(ButterflyStage stage) {
		this.stage = stage;
	}
	
	public void walk() {
		if(stage == ButterflyStage.Caterpilar) {
			System.out.println("I can walk (crawl)");
		}
		else {
			System.out.println("I cannot walk");
		}
	}
	
	public void fly() {
		if(stage == ButterflyStage.Caterpilar) {
			System.out.println("I cannot fly");
		}
		else {
			System.out.println("I can fly");
		}
	}
	
	public void sound() {
		System.out.println("I does not make a sound");
	}
}
