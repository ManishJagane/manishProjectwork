package iFFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frameStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String txt = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(txt);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.tagName("input")).sendKeys("asdfghgd");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
		Thread.sleep(100);
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(100);
		
		driver.findElement(By.tagName("input")).sendKeys("not enough");
		
		driver.switchTo().defaultContent();
		
		// using web element method
		WebElement frame3 = driver.findElement(By.xpath("(//iframe[@class=' ezlazyloaded'])[2]"));
		driver.switchTo().frame(frame3);
		WebElement cat = driver.findElement(By.id("animals"));
		
		Select s=new Select(cat);
		s.selectByIndex(1);
		

	}

}
