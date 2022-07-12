package kitePOMusingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteApplogIn 
{
	@FindBy (id="userid") private WebElement username;
	@FindBy (id="password") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement logIn;
	
	public kiteApplogIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendUsername(String UserName)
	{
		username.sendKeys(UserName);
	}
	
	public void sendpassword(String passWord)
	{
		password.sendKeys(passWord);
	}
	public void clickLogin()
	{
		logIn.click();
	}
	

}
