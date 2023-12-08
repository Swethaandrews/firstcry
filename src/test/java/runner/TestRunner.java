package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\Swetha Andrews\\eclipse-workspace\\FirstCryProject\\src\\test\\java\\feature\\login.feature",
	glue = {"Steps"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/TestreportToday.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	}, 
	monochrome = true,// console output will be in more readable format
	 tags = "@Login"
		
		)



public class TestRunner {

}
