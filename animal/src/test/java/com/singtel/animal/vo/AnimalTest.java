package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class AnimalTest extends BaseTest {
	@InjectMocks
	private Animal animal;

	@Test
	public void test_walk() throws Exception {
		animal.walk();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I am walking"));
	}
	
	@Test
	public void test_fly() throws Exception{
		animal.fly();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I am flying"));
	}
	
	@Test
	public void test_sing() throws Exception{
		animal.sing();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I am singing"));
	}

	@Test
	public void test_say() throws Exception{
		animal.say();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I am saying"));
	}
	
	@Test
	public void test_swim() throws Exception{
		animal.swim();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I am swimming"));
	}
}
