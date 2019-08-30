package stepdefs;

import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageobjects.HomePageLogin;
import pageobjects.HomePageSearchHotel;

public class SearchHotel {
	
	HomePageSearchHotel hpsh = new HomePageSearchHotel();

	/*@Given("^PHP Travel homepage is displayed$")
    public void php_travel_homepage_is_displayed() throws Throwable {
       
    }

    /*@When("^User click hotel menu$")
    public void user_click_hotel_menu() throws Throwable {
        hpsh.HotelMenu();
    }  */

    @When("^User enter city$")
    public void user_enter_city() throws Throwable {
    	hpsh.SearchHotelLocation();
     
    }

    @And("^User enter check in date$")
    public void user_enter_check_in_date() throws Throwable {
    	hpsh.CheckInDate();
    }

    @And("^User enter check out date$")
    public void user_enter_check_out_date() throws Throwable {
    	hpsh.CheckOutDate();
    }
        
    @And("^User enter total guest$")
    public void user_enter_total_guest() throws Throwable {
    	hpsh.TotalGuest();
    }

    @And("^User click search$")
    public void user_click_search() throws Throwable {
    	hpsh.SearchButton();
    	      
    }
    
    @Then("^Verify hotel list is displayed$")
    public void verify_hotel_list_is_displayed() throws Throwable {
        
    }


}
