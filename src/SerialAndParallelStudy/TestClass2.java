package SerialAndParallelStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void kitelogin() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(6000);
		driver.close();
  }
}
