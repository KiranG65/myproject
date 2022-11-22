package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature1.feature",
		glue="org.magnitia.kira",
		plugin= {"pretty", "html:target\\result"},
		monochrome=true)
		

public class Runner
{

}



