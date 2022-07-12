package SerialAndParallelStudy;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
  @Test
  public void method1() throws InterruptedException 
  {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.close();
  }
}
