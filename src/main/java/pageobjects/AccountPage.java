package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends ABasePageObjects {
	
	@FindBy (xpath="//h3[@class='RTL']")
	private WebElement AccountName;

	public AccountPage() {
		initObjects(this);
	}
	
	public void VerifyAccount(String firstname, String lastname) {
		wait.until(ExpectedConditions.visibilityOf(AccountName));
		if (AccountName.getText().contains(firstname+" "+lastname)) {
			logger.info("Account successfull created");
			//System.out.println("Account successfull created");
		}
		
	}

}
