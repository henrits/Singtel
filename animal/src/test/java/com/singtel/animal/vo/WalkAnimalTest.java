package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class WalkAnimalTest extends BaseTest {
	@InjectMocks
	private WalkAnimal walkAnimal;
	
	@Test
	public void test_fly() {
		walkAnimal.fly();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot fly"));
	}
	
	@Test
	public void test_sing() {
		walkAnimal.sing();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot sing"));
	}
	
	@Test
	public void test_swim() {
		walkAnimal.swim();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot swim"));
	}
}
