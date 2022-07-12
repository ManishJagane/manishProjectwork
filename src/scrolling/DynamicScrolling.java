package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicScrolling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	   JavascriptExecutor e = (JavascriptExecutor)driver;
	   e.executeScript("window,scrollBy(80,800)");
	
		

	}

}
