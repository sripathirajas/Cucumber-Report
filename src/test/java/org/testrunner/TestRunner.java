package org.testrunner;

import org.base.Reporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\main\\resources\\" }, glue = { "org.stepdefinition" }, monochrome = true, plugin = {
		"pretty",
		"json:C:\\Users\\srira\\eclipse-workspace\\SriRam\\Raja\\SriPathi\\CucumberTable\\Reporting\\AdactinReport.json" })
public class TestRunner {

	@AfterClass
	public static void afterClass() {

		Reporting.JVMreportGeneration(
				"C:\\Users\\srira\\eclipse-workspace\\SriRam\\Raja\\SriPathi\\CucumberTable\\Reporting\\AdactinReport.json");

	}

}
