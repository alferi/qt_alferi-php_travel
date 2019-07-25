package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;
import pageobjects.HomePageSignUp;
import pageobjects.SignUpPage;
import utils.PropertyHandler;

public class NewCustRegistration {
	
	HomePageSignUp hps = new HomePageSignUp();
	SignUpPage sup = new SignUpPage();
	AccountPage ap = new AccountPage();

	 @Given("^PHP Travel homepage open$")
	    public void php_travel_homepage_open() throws Throwable {
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
	    
	    @Then("^Verify my account page open$")
	    public void verify_my_account_page_open() throws Throwable {
	    	String fn = PropertyHandler.dataProperty.getValue("first_name");
	    	String ln = PropertyHandler.dataProperty.getValue("last_name");
	        ap.VerifyAccount(fn,ln);
	    }


}
