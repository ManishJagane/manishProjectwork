package POMkite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pinPagePOM 
{
	@FindBy (id="pin") private WebElement PIN;
	@FindBy (xpath="//button[text()='Continue ']") private WebElement continuebutton;
	
	public pinPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendkeyPin(String Pin)
	{
		PIN.sendKeys(Pin);
	}
	public void clickOnContinue()
	{
		continuebutton.click();
	}

}
