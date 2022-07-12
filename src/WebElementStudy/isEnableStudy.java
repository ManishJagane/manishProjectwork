package WebElementStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnableStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
		
		WebElement continueButton = driver.findElement(By.id("email-otp-btn"));
		System.out.println(continueButton.isEnabled());
		
		driver.findElement(By.id("cb-user-mail")).sendKeys("manishjagane6@gmail.com");
		
		System.out.println(continueButton.isEnabled()); 

	}

}
