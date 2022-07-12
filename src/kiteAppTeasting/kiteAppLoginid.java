package kiteAppTeasting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteAppLoginid {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[text()='Login ']"));
		
		userID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		login.click();
		
		Thread.sleep(5000);
		
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[text()='Continue ']"));
		
		pin.sendKeys("982278");
		continuebutton.click();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualID = username.getText();
		
		String expectedID="ELR321";
		
		if(actualID.equals(expectedID))
		{
			System.out.println("User ID matching TC is PASSED");
		}
		else {
			System.out.println("User ID Not matching TC is failed");
		}
		
		username.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
	
		

	}

}
