package Runner;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)

	@CucumberOptions(
	features = "src/test/java/feature",
	plugin = { "pretty","json:target/cucumber/mysamlog.json","html:target/cucumber-reports"},
	monochrome = true,
	tags = {"@smok1"},
	glue={"stepDefinitions"}  //,dryRun = true //the path of the step definition files
	)
	

	
	public class TestRunner {

	@Test
	public void start() {
		
		String browser ="API";
		
	}
}