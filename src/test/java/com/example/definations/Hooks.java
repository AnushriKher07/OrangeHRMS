package com.example.definations;

import org.testng.annotations.BeforeTest;

import com.example.definitions.After;
import com.example.definitions.Before;
import com.example.definitions.Scenario;
import com.example.definitions.TakesScreenshot;
import com.example.utils.HelperClass;

public class Hooks {
	@BeforeTest
    public static void setUp() {

       HelperClass.setUpDriver();
    }

	@After
	public static void tearDown(Scenario scenario) {

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test"); 
		}	
		
		HelperClass.tearDown();
	}


}
