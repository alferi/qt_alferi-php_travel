package stepdefs;

import io.cucumber.java.After;
import utils.WebDriverFactory;

public class Hooks {
	
	@After
    public void afterScenario(){
		WebDriverFactory.removeDriver();
	}
}
