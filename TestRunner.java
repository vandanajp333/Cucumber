package runnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/home/ranjith/Documents/workspace2/Cucumber/src/test/java/featureFiles/parameterization.feature",
		glue="stepDefinitionFiles"
		)

public class TestRunner {

}
