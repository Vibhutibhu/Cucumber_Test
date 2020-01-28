package Test_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile", glue = { "stepDEfinition" },tags="@user-specific")
public class LoginRunner {

}
