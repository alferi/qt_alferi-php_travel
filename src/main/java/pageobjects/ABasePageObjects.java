package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.PropertyHandler;
import utils.WebDriverFactory;

public abstract class ABasePageObjects {
	
		protected static final Logger logger = LogManager.getLogger(ABasePageObjects.class); 
	
		protected WebDriver driver;
		protected WebDriverWait wait ; 
    
    protected WebDriver getDriver() {
        return WebDriverFactory.getInstance().getWebDriver();
    }
	
    protected void initObjects(Object childPage) {
    	this.driver = getDriver();
		PageFactory.initElements(driver, childPage);
		this.wait = new WebDriverWait(this.driver, Integer.valueOf(PropertyHandler.dataProperty.getValue("timeout")));
	}
    
    

}
