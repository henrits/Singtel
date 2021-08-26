package com.singtel.animal.vo;

import java.io.PrintStream;

import org.junit.Before;
import org.mockito.Mock;

public class BaseTest {
	@Mock
	protected PrintStream printStream;
	
	@Before
	public void setup() {
		System.setOut(printStream);
	}
}
