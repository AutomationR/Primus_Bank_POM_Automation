package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featurefiles", glue = { "com.automation.stepdefinitions" }, plugin = {
		"pretty", "html:target/test-output" }, // to generate different type of report
		monochrome = true, // display the readable format
		strict = true, // stop the execution for when it finds the undefined steps
		dryRun = false, // finds the undefined steps only {not executes the other
		// steps}
		tags = {"@error"})

public class CucumberTestRunner {

}
