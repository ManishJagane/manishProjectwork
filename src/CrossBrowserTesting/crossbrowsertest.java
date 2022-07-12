package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertest {

	@Parameters("BrawserName")
	@Test
  public void crosstesting(String name) throws InterruptedException
  
  {
	  WebDriver driver = null;
	  if(name.equals("chrome"))
	  {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		 driver=new ChromeDriver();
	  }
	  
	  else if (name.equals("firefox"))
	  {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
	  }
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	
  }
}
