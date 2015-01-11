package com.gokhankacan.mavenTest;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	private App app;
	
	public void setUp() throws Exception {
		super.setUp();
		app = new App();
	}
	
	@Test
	public void testEasy() {
		assertEquals("Test hier lengte x width", 4, app.easy(2, 2));
	}
	

	public void tearDown() throws Exception {
		super.tearDown();
	}

}
