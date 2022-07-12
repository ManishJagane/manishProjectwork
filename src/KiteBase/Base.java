package KiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
	protected WebDriver driver;
	public void openBrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	ChromeOptions opt= new ChromeOptions();
	//opt.addArguments("--disable-notifications");
	//opt.addArguments("headless");
	//opt.addArguments("incognito");
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com");
	Reporter.log("Launching browser");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
	
	

}
