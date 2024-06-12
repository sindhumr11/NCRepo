package cucumberStepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\user\\eclipse-workspace\\AutomationSelenium\\src\\test\\resources\\Features",
		glue = "cucumberStepDefinitions",
		tags = "~@Smoke or @Regression"
			
		)


public class TestRunner {

	
	
}
