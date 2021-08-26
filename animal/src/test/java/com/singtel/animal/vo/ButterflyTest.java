package com.singtel.animal.vo;

import static org.mockito.Matchers.eq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.modules.junit4.PowerMockRunner;

import com.singtel.animal.enums.ButterflyStage;

@RunWith(PowerMockRunner.class)
public class ButterflyTest extends BaseTest {
	@Test
	public void test_caterpilar_walk() throws Exception {
		Butterfly caterpilar = new Butterfly(ButterflyStage.Caterpilar);
		caterpilar.walk();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I can walk (crawl)"));
	}

	@Test
	public void test_caterpilar_fly() throws Exception {
		Butterfly caterpilar = new Butterfly(ButterflyStage.Caterpilar);
		caterpilar.fly();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot fly"));
	}

	@Test
	public void test_caterpilar_sound() throws Exception {
		Butterfly caterpilar = new Butterfly(ButterflyStage.Caterpilar);
		caterpilar.sound();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I does not make a sound"));
	}

	@Test
	public void test_butterfly_walk() throws Exception {
		Butterfly butterfly = new Butterfly(ButterflyStage.Butterfly);
		butterfly.walk();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I cannot walk"));
	}

	@Test
	public void test_butterfly_fly() throws Exception {
		Butterfly butterfly = new Butterfly(ButterflyStage.Butterfly);
		butterfly.fly();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I can fly"));
	}

	@Test
	public void test_butterfly_sound() throws Exception {
		Butterfly butterfly = new Butterfly(ButterflyStage.Butterfly);
		butterfly.sound();
		Mockito.verify(printStream, VerificationModeFactory.times(1)).println(eq("I does not make a sound"));
	}
}
