package popupHandlig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupstudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//input[@class='_3704LK']//input[@class='_3704LK']")).sendKeys("oneplus10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']//input[@class='_3704LK']")).sendKeys("oneplus10");

		

	}

}
