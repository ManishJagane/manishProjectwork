package WebDriverStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manishjagane6@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mj11manish1996");
//		
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jagane");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		//driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("manishj6662gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("mj123456");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("13");
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("jan");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1998");
		//driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
		//getText method
		System.out.println(driver.findElement(By.xpath("//div[text()='Sign Up']")).getText());
		String text = driver.findElement(By.xpath("//div[text()='Sign Up']")).getText();
		System.out.println(text);
		
		

	}

}
