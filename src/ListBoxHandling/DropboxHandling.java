package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropboxHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		 WebElement day = driver.findElement(By.id("day"));
		 
		 Select s= new Select(day);
		 
		 s.selectByValue("11");
		 
		  WebElement month = driver.findElement(By.id("month"));
		  
		  Select s1= new Select(month);
		  
		  s1.selectByIndex(5);
		  
		  WebElement year = driver.findElement(By.id("year"));
		  
		  Select s2= new Select(year);
		  s2.selectByVisibleText("1996");
		  
		  driver.findElement(By.xpath("//input[@value='2']")).click();
		  
		  driver.findElement(By.name("firstname")).sendKeys("Manish");
		  driver.findElement(By.name("lastname")).sendKeys("Jagane");
		  driver.findElement(By.name("reg_email__")).sendKeys("9665720417");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("manishjagane6@gmail.com");
		  driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		

	}

}
