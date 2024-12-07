package com.e2etests.automation;

import org.junit.runner.RunWith;

/**
* The Test Runner File uses the @RunWith() Annotation from JUnit for executing tests.
*/

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)

/**
* The @CucumberOptions Annotation is used to define the location of feature files, step definitions, reporting
* integration.
*/


@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:trarget/cucumber-report.html"},
		tags = ("@connexion"),
		//glue = {"com.e2etests.automation.step_definitions"},
		monochrome = true,
		snippets = CAMELCASE
		)

public class RunWebSuiteTest {

}