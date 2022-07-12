package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import kiteUtility.UtilityProp;

public class BaseNewByListener 
{
	protected static WebDriver driver;
	public void openBrowser() throws IOException
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityProp.getDataFromPropertyfile("URL"));
	Reporter.log("Launching browser");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}


}
