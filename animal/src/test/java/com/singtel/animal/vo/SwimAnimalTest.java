package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class SwimAnimalTest extends BaseTest {
	@InjectMocks
	private SwimAnimal swimAnimal;

	@Test
	public void test_walk() throws Exception {
		swimAnimal.walk();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot walk"));
	}
	
	@Test
	public void test_fly() throws Exception{
		swimAnimal.fly();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot fly"));
	}
	
	@Test
	public void test_sing() throws Exception{
		swimAnimal.sing();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot sing"));
	}
}
