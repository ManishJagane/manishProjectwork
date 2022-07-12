package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		Thread.sleep(1000);
		
		kiteApplogIn login = new kiteApplogIn(driver);
		login.sendUsername();
		login.sendpassword();
		login.clickLogin();
		
		Thread.sleep(2000);
		
		pinPagePOM pinpage= new pinPagePOM(driver);
		pinpage.sendkeyPin();
		pinpage.clickOnContinue();
		
		Thread.sleep(2000);
		
		kiteHomePage home= new kiteHomePage(driver);
		home.validateUsername();
		home.LogOut();
		
		driver.close();
	

	}

}
