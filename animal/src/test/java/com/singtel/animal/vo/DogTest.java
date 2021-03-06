package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class DogTest extends BaseTest {
	@InjectMocks
	private Dog dog;

	@Test
	public void test_say() throws Exception {
		dog.say();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Woof, woof"));
	}
}
