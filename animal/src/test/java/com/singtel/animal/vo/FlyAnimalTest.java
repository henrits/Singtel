package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class FlyAnimalTest extends BaseTest {
	@InjectMocks
	private FlyAnimal flyAnimal;

	@Test
	public void test_swim() throws Exception {
		flyAnimal.swim();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot swim"));
	}
}
