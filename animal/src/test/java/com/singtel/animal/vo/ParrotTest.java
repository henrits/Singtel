package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

import com.singtel.animal.enums.Animals;

@RunWith(PowerMockRunner.class)
public class ParrotTest extends BaseTest {
	@Test
	public void test_say_dog() throws Exception {
		Parrot parrot = new Parrot(Animals.Dog);
		parrot.say();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Woof, woof"));
	}

	@Test
	public void test_say_cat() throws Exception {
		Parrot parrot = new Parrot(Animals.Cat);
		parrot.say();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Me ow"));
	}

	@Test
	public void test_say_rooster() throws Exception {
		Parrot parrot = new Parrot(Animals.Rooster);
		parrot.say();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("Cock-a-doodle-doo"));
	}
}
