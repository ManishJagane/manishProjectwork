package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class kiteHomePage 
{
	@FindBy (xpath = "//span[@class='user-id']") private WebElement userName;

	@FindBy (xpath = "//a[@target='_self']") private WebElement logout;
	
	public kiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateUsername()
	{
		String expectedUserName= "ELR321";
		String actualUserName= userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Actual and expected result are matched TC is passes");
		}
		else
		{
			System.out.println("Actual and Expected are not matched hence TC is failed");
		
			
		}
	}
		
	 	public void LogOut() throws InterruptedException
	{
	 		userName.click();
	 		Thread.sleep(1000);
	 		logout.click();
			
		}
	}


