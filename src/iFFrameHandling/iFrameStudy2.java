package iFFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameStudy2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		//main page
		WebElement text1 = driver.findElement(By.linkText("Pavilion"));
		System.out.println(text1.getText());
		Thread.sleep(1000);
		
		//switch to frame 1
		driver.switchTo().frame("Frame1");
		
		String text2 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		
		System.out.println(text2);
		
		//we have to first back to main page from fame 1
		driver.switchTo().parentFrame(); // this method used to switch from frame 1 to main page  
		
		//to switch  to frame2
		driver.switchTo().frame("Frame2");
		String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		System.out.println(text3);
		
		driver.switchTo().parentFrame();
		
		String text4 = driver.findElement(By.linkText("Blogger")).getText();
		System.out.println(text4);
	
		
		

	}

}
