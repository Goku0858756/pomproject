package com.gokhankacan.mavenTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestApp {

	private App app;
	
	@Before
	public void setUp() throws Exception {
		app = new App();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(app.easy(2, 5), 10);
	}

}
