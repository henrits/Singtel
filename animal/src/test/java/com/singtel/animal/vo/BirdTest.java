package com.singtel.animal.vo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.Matchers.eq;

@RunWith(PowerMockRunner.class)
public class BirdTest extends BaseTest {
	@InjectMocks
	private Bird bird;
	
	@Test
	public void test_fly() throws Exception{
		bird.fly();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I am flying"));
	}
	
	@Test
	public void test_sing() throws Exception{
		bird.sing();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I am singing"));
	}
}
