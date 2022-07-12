package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("katherine");
		Thread.sleep(1000);
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println(searchresult.size());
		
		for(WebElement sr:searchresult)
		{
			System.out.println(sr.getText());
		}
		
		Thread.sleep(1000);
		//for click on requared result
	
		for(WebElement result: searchresult)
		{
			String actual = result.getText();
			String acpt= "katherine langford movies";
			
			if(actual.equals(acpt))
			{
				result.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		
		List<WebElement> totalimg = driver.findElements(By.tagName("img"));
		System.out.println(totalimg.size());
		
		
		

	}

}
