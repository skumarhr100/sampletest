package Runner;
import java.io.PrintStream;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	
	
	
	
	@CucumberOptions(
	features = "src/test/java/feature",
	plugin = {"pretty","html:target/cucumber-reports"},
	monochrome = true,
	tags = {"@foror1"},
	glue={"stepDefinitions"}  //,dryRun = true //the path of the step definition files
	)
	 
	public class TestRunner2 {

	
		
}