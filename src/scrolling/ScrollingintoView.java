package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingintoView {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement chinchwad = driver.findElement(By.xpath("//strong[text()='Chinchwad Branch']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",chinchwad);
		
		

	}

}
