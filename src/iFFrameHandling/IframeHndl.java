package iFFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHndl {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Read More'])[1]")).click();
		


	}

}
