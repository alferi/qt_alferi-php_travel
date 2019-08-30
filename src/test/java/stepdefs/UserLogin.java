package stepdefs;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageLogin;
import pageobjects.LoginPage;

public class UserLogin {
	
	HomePageLogin hpl = new HomePageLogin();
	LoginPage lp = new LoginPage();
	
//	    }
	
    @When("^User click login menu$")
    public void user_click_sign_in_menu() throws Throwable {
        hpl.login();
    }


    @And("^User enter correct login data$")
    public void user_enter_correct_data() throws Throwable {
        lp.Login();
    }

    @And("^User click login$")
    public void user_click_login() throws Throwable {
        lp.LoginBtn();
    }
    
    @Then("^Verify my login page is displayed$")
    public void verify_my_account_page_open() throws Throwable {
       
    }
	

}
