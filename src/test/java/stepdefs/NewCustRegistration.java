package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;
import pageobjects.HomePageSignUp;
import pageobjects.SignUpPage;
import utils.PropertyHandler;
import utils.WebDriverFactory;

public class NewCustRegistration {
	 

	HomePageSignUp hps;
	SignUpPage sup ;
	AccountPage ap ;

	 @Given("^PHP Travel homepage is displayed$")
	    public void php_travel_homepage_displayed() throws Throwable {
		    WebDriverFactory.driver = WebDriverFactory.getWebDriver();
		    hps = new HomePageSignUp();
		    sup = new SignUpPage();
		    ap = new AccountPage();
	        hps.setUrl();
	    }

	    @When("^User click sign up menu$")
	    public void user_click_sign_up_menu() throws Throwable {
	    	hps.signUp();
	    }

	    @And("^User enter correct data$")
	    public void user_enter_correct_data() throws Throwable {
	        sup.signUp();
	    }

	    @And("^User click submit$")
	    public void user_click_submit() throws Throwable {
	        sup.ClickSubmit();
	    }
	    
	    @Then("^Verify my account page is displayed$")
	    public void verify_my_account_page_displayed() throws Throwable {
	    	String fn = PropertyHandler.dataProperty.getValue("first_name");
	    	String ln = PropertyHandler.dataProperty.getValue("last_name");
	        ap.VerifyAccount(fn,ln);
	    }


}
