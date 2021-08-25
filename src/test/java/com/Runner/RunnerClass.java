package com.Runner;

	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	features="./src/test/resources/features",
	glue= "com.StepDefination",
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	tags= "@tag4"
	)
	public class RunnerClass {

	}


