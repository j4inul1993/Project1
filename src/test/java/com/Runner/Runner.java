package com.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="com.StepDef"
		)

public class Runner extends AbstractTestNGCucumberTests{


}
