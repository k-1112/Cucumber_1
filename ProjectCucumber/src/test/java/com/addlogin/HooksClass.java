package com.addlogin;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass {
		
	@Before
	public static void setup() {
		HelperClass.setUpDriver();
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		HelperClass.tearDown();
	}
}
