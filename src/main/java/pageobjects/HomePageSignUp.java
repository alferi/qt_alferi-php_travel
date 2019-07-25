package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.PropertyHandler;

public class HomePageSignUp extends ABasePageObjects {
	
	@FindBy(xpath ="//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")
	private WebElement MyAccountMenu;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")
	private WebElement SignUpMenu;
	
	
	public HomePageSignUp() {
		initObjects(this);
	}
	
	public void setUrl() {
		
		driver.manage().window().maximize();
		String url = PropertyHandler.dataProperty.getValue("url");
		driver.get(url);
	}
	
	public void signUp() {
		MyAccountMenu.click();
		SignUpMenu.click();
	}
	

	
	
	

}
