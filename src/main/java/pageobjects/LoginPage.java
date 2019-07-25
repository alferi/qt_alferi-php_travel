package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.PropertyHandler;

public class LoginPage extends ABasePageObjects {
	
	@FindBy (xpath= "//input[@placeholder='Email']")
	private WebElement Email;
	
	@FindBy (xpath= "//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy (xpath= "//button[@class='btn btn-action btn-lg btn-block loginbtn']")
	private WebElement LoginBtn;
	
	public LoginPage() {
		initObjects(this);
	}
	
	public void Login() {		
		String em = PropertyHandler.dataProperty.getValue("email");
		Email.sendKeys(em);
		String pw = PropertyHandler.dataProperty.getValue("password");
		Password.sendKeys(pw);
	}
	
	public void LoginBtn() {
		LoginBtn.click();
		
		
	}
	
	

}
