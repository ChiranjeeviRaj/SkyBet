package uk.skybet.football.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions
  (
	  features = "src/test/java/features",	  
	  glue = "uk.skybet.stepdefinations",
	  plugin = {"pretty","html:target/cucumber"}
  )

public class TestRunner 
{

}
