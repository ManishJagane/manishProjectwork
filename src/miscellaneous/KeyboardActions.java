package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		// How to use sendkey by using action class 
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		
		//create object of actions class
		Actions act = new Actions(driver);
		act.sendKeys(textbox, "Good Morning").perform();
		
		Thread.sleep(1000);
		
		
		//* Dropdown handling  by using action class 
		
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		act.click(listbox).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		

	}

}
