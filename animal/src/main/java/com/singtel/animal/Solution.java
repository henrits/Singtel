package com.singtel.animal;

import com.singtel.animal.vo.Animal;
import com.singtel.animal.vo.Bird;
import com.singtel.animal.vo.Butterfly;
import com.singtel.animal.vo.Cat;
import com.singtel.animal.vo.Chicken;
import com.singtel.animal.vo.ClownFish;
import com.singtel.animal.vo.Dog;
import com.singtel.animal.vo.Dolphin;
import com.singtel.animal.vo.Duck;
import com.singtel.animal.vo.Fish;
import com.singtel.animal.vo.Frog;
import com.singtel.animal.vo.Parrot;
import com.singtel.animal.vo.Rooster;
import com.singtel.animal.vo.Sharks;

public class Solution {
	public static void main(String[] args) {
		Animal [] animals = new Animal[] {
			new Bird(),
			new Duck(),
			new Chicken(),
			new Rooster(),
			new Parrot(),
			new Fish(),
			new Sharks(),
			new ClownFish(),
			new Dolphin(),
			new Frog(),
			new Dog(),
			new Butterfly(),
			new Cat()
		};
		
		new Solution().showResult(animals);
	}
	
	public void showResult(Animal [] animals) {
		int canFly = 0;
		int canWalk = 0;
		int canSing = 0;
		int canSwim = 0;
		
		if(animals != null && animals.length != 0) {
			for(Animal animal : animals) {
				if(animal.isCanFly()) canFly++;
				if(animal.isCanWalk()) canWalk++;
				if(animal.isCanSing()) canSing++;
				if(animal.isCanSwim()) canSwim++;
			}
			
			System.out.println("How many of these animals can fly ? " + canFly);
			System.out.println("How many of these animals can walk ? " + canWalk);
			System.out.println("How many of these animals can sing ? " + canSing);
			System.out.println("How many of these animals can swim ? " + canSwim);
		}
	}
}
