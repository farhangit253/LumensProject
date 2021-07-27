package com.lumens.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class RunnerClass {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features= {"features"},glue = {"com.lumens.stepdefinition"},
	plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent reports/report.html"},
	dryRun=false,
	monochrome=true,
	tags="@Scenario5"
	)
	public static class lumensrunnerclass {

		
	}


}
