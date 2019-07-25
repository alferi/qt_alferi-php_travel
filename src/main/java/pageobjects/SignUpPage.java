package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.PropertyHandler;

public class SignUpPage extends ABasePageObjects {
	
	@FindBy (xpath= "//input[@placeholder='First Name']")
	private WebElement FirstName;
	
	@FindBy (xpath= "//input[@placeholder='Last Name']")
	private WebElement LastName;
	
	@FindBy (xpath= "//input[@placeholder='Mobile Number']")
	private WebElement MobileNumber;
	
	@FindBy (xpath= "//input[@placeholder='Email']")
	private WebElement Email;
	
	@FindBy (xpath= "//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy (xpath= "//input[@placeholder='Confirm Password']")
	private WebElement ConfirmPassword;
	
	@FindBy (xpath= "//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")
	private WebElement SignUpBtn;
	
	public SignUpPage() {
		initObjects(this);
	}
	

	public void signUp() {
		String fn = PropertyHandler.dataProperty.getValue("first_name");
		FirstName.sendKeys(fn);
		String ln = PropertyHandler.dataProperty.getValue("last_name");
		LastName.sendKeys(ln);
		String mn = PropertyHandler.dataProperty.getValue("mobile_number");
		MobileNumber.sendKeys(mn);
		String em = PropertyHandler.dataProperty.getValue("email");
		Email.sendKeys(em);
		String pw = PropertyHandler.dataProperty.getValue("password");
		Password.sendKeys(pw);
		String cpw = PropertyHandler.dataProperty.getValue("confirm_password");
		ConfirmPassword.sendKeys(cpw);
		
	}
	
	public void ClickSubmit() {
		SignUpBtn.click();
		
	}
	

	
}
