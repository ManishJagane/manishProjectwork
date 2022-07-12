package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpathHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("oneplus 10R");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);		
		 String review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
		System.out.println(review);
		

	}

}
