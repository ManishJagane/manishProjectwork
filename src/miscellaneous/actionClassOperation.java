package miscellaneous;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassOperation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		WebElement seleniumclick = driver.findElement(By.linkText("Selenium"));
		
		// click by using normal web element method 
		//seleniumclick.click();
		
		
		// perform action by using action class or by using mouse action
		
		//1. create object of action class
		Actions act= new Actions(driver);
		
		//1.option 1
		//act.moveToElement(seleniumclick).click().build().perform();
		
		//option 2
		// act.moveToElement(seleniumclick).perform();
		
		//option 3
		//act.click(seleniumclick).perform();
		
		// hhow to right click by using action class
		
		Thread.sleep(1000);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//act.moveToElement(rightclick).contextClick().perform();
		
		//act.contextClick(rightclick).perform();
		
		
		//* double click action 
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.moveToElement(doubleclick).doubleClick().build().perform();
		
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
		
		

	}

}
