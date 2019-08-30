package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	
	private static WebDriverFactory instance = new WebDriverFactory();
	public static WebDriver driver; //= WebDriverFactory.getWebDriver();
	
	public static WebDriverFactory getInstance( ) {
		return instance;
	}
	
	public static WebDriver getWebDriver() {
		return newWebDriver();
	}
	
	public static void removeDriver( ) {
		driver.quit();
	}
			
	private static WebDriver newWebDriver() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		return driver;
	}

}
