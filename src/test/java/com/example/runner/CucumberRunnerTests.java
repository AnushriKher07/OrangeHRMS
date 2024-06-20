package com.example.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags = "", features = "src/test/resources/features/LoginPage.feature", glue = "com.example.definitions",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests  {

}
