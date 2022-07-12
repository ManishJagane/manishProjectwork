package verificationAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asertionStudy {
  @Test
  public void redioselect() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#");
		
		Thread.sleep(1000);
		WebElement redio1Button = driver.findElement(By.xpath("//input[@value='Radio1']"));
	  //redio1Button.click();
	  
	  if(redio1Button.isSelected())
	  {
		  Reporter.log("Radio button selected TC passed", true);
	  }
	  else {
		  Reporter.log("Readio button not selected TC failed", true);
	  }
	  
	  driver.close();
  }
}
