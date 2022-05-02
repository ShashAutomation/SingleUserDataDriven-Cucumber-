package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"F:\\selenium projects\\CucmberTest2\\src\\test\\resources\\features\\Input.feature"},
			
				
		glue= {"Stepdefinitions"},
		plugin= {"pretty"},
		stepNotifications=true,
		monochrome=true,
		dryRun=false
		)
public class Runner {

}
