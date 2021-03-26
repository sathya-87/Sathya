package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepdefinition.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue= {"com.stepdefinition"},monochrome=true,tags= {" @smokes4"},dryRun=false,strict=true,plugin= {"json:src\\test\\resources\\Reports\\jsonfile.json"})



public class TestRunnerClass {
	@AfterClass
	public static void afterclass() {

	JVMReport.generateReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\jsonfile.json");

}

}