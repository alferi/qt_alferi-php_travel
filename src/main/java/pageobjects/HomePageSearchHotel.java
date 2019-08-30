package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.PropertyHandler;

public class HomePageSearchHotel extends ABasePageObjects {
	
	/*@FindBy (xpath= "//li[@class='text-center active']//a[@class='text-center']")
	private WebElement HotelMenu;*/
		
	@FindBy (xpath= "//span[contains(text(),'Search by Hotel or City Name')]")
	private WebElement Location1;
	
	//@FindBy (xpath= "//div[@id='select2-drop']//input[@class='select2-input']")
	@FindBy (xpath= "//div[@id='select2-drop']//input[@class='select2-input select2-focused']")
	private WebElement Location2;
	
	@FindBy (xpath = "//ul[@class='select2-result-sub']/li[1]/div")
	private WebElement CityName;
	
	
	@FindBy (xpath= "//input[@name='checkin']")
	private WebElement CheckIn;
	
	@FindBy (xpath= "//input[@name='checkout']")
	private WebElement CheckOut;
	
	@FindBy (xpath= "//input[@id='htravellersInput']")
	private WebElement Guest;
	
	@FindBy (xpath= "//button[@id='hadultMinusBtn']")
	private WebElement GuestAdult;
	
	@FindBy (xpath= "//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")
	private WebElement SearchBtn;
	
	public HomePageSearchHotel() {
		initObjects(this);
	}
	
	public void setUrl() {
		
		driver.manage().window().maximize();
		String url = PropertyHandler.dataProperty.getValue("url");
		driver.get(url);
	}
	
	public void SearchHotelLocation() {		
		String loc = PropertyHandler.dataProperty.getValue("city");
		Location1.click();
		Location2.sendKeys(loc);
		CityName.click();
		//CheckIn.sendKeys(Keys.TAB);		
	}
	
	public void CheckInDate() {
		String ci = PropertyHandler.dataProperty.getValue("check_in");
		CheckIn.sendKeys(ci);
		//CheckIn.sendKeys(Keys.TAB);		
	}
	
	public void CheckOutDate() {
		String co = PropertyHandler.dataProperty.getValue("check_out");
		CheckOut.sendKeys(co);	
	}
	
	public void TotalGuest() {
		Guest.click();
		GuestAdult.click();
		Guest.click();
		Guest.sendKeys(Keys.ENTER);
	}
	
	public void SearchButton() {
		wait.until(ExpectedConditions.elementToBeClickable(SearchBtn)).click();
		//SearchBtn.click();
	}		
	

}
