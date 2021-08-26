package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class SharksTest extends BaseTest {
	@InjectMocks
	private Sharks sharks;

	@Test
	public void test_characteristic() throws Exception {
		sharks.characteristic();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Sharks are large and grey"));
	}
	
	@Test
	public void test_hobby() throws Exception {
		sharks.hobby();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Sharks eat other fish"));
	}
}
