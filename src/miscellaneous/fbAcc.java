package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbAcc {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		
		Actions act= new Actions(driver);
		WebElement day = driver.findElement(By.id("day"));
		
		act.click(day).perform();
		Thread.sleep(1000);
		
		for(int i=1; i<=3; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(100);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(300);
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		Thread.sleep(300);
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(200);
		WebElement year = driver.findElement(By.id("year"));
		
		act.click(year).perform();
		
		for(int i=1; i<=26; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(100);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		

	}

}
