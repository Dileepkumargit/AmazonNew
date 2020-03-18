package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Dhilip\\eclipse-workspace\\Projeact1\\src\\test\\java\\Myntra\\Projeact1\\Myntra.feature"},
		glue     = {"StepDefination"},
//        plugin = {"html:target/cucumber-reports"},
        monochrome = true)
	
					
public class Runner {

}
