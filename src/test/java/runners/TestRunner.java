package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="D:\\Automation Test\\Eclipse\\Workspace\\PHPTravel\\src\\test\\resources\\features",  //folder path
		glue = {"stepdefs"}) // package name
		

public class TestRunner extends AbstractTestNGCucumberTests {

	
	

}
