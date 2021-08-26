package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

import com.singtel.animal.enums.Gender;

@RunWith(PowerMockRunner.class)
public class ChickenTest extends BaseTest {
	@Test
	public void test_say_male() throws Exception {
		Chicken chicken = new Chicken(Gender.Male);
		chicken.say();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Cock-a-doodle-doo"));
	}
	
	@Test
	public void test_say_female() throws Exception {
		Chicken chicken = new Chicken(Gender.Female);
		chicken.say();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Cluck, cluck"));
	}
}
