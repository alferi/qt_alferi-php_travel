package stepdefs;

import io.cucumber.java.After;
import utils.WebDriverFactory;

public class Hook {
	
	@After
    public void afterScenario(){
		WebDriverFactory.getInstance().removeDriver();
	}
}
