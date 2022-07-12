package Screenshot_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot2 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination= new File("D:\\Selenium\\ScreenshotBySelenium\\screenshot2.jpeg");
		
		FileHandler.copy(source, destination);
		
		driver.findElement(By.xpath("//input[@type='date']")).click();
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination1= new File("D:\\Selenium\\ScreenshotBySelenium\\screenshot3.png");
		
		FileHandler.copy(source1, destination1);
		
		
	
		
	}

}
