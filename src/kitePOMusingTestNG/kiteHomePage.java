package kitePOMusingTestNG;

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
	public void validateUsername(String expectedUserID)
	{
		String expectedUserName= expectedUserID;
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
	
	// to get Actual Username
	public String getActualUsername()
	{
		String actualUserName=userName.getText();
		return actualUserName;
	}
		
	 	public void LogOut() throws InterruptedException
	{
	 		userName.click();
	 		Thread.sleep(1000);
	 		logout.click();
			
		}
	}


