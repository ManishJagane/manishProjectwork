package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class my1stTestclass {
  @Test
  public void myMethod() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
	
		Thread.sleep(1000);
		Reporter.log("Hi his is method reporter true", true);
		driver.close();
	
  }
  @Test
  public void myMethod1() throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		System.out.println("Hi this is printing statement");
		Reporter.log("Hi this iis reporter ");
		Reporter.log("Hi this is method1 reporter true", true);
		driver.close();
	
	  
  }
}
