package com.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resource/features/practice.feature" },
		// tags = "@Positive_UnFreezeNSDLMaker",
		glue = { "apphook", "com/stepdef" }, dryRun = false, plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true)
public class TestRunner  {
	
	public static void main(String[] args) {
        System.out.println("Inside Test Runner class");
    }
}