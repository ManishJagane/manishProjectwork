package Screenshot_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotAuto1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000); 
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make(3);
		
		File destination= new File("D:\\Selenium\\ScreenshotBySelenium\\Screenshot"+str+".png");
		
		FileHandler.copy(source, destination);
		
	

	}

}
