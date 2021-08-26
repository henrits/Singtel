package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class ClownFishTest extends BaseTest {
	@InjectMocks
	private ClownFish clownFish;

	@Test
	public void test_characteristic() throws Exception {
		clownFish.characteristic();
		Mockito.verify(printStream, VerificationModeFactory.times(1))
				.println(eq("ClownFish are small and colourful (orange)"));
	}

	@Test
	public void test_hobby() throws Exception {
		clownFish.hobby();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("ClownFish make jokes"));
	}
}
