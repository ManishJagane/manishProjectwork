package WebElementStudy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		 
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		
		//checkbox1.click();
		
		// by using if else 
		
		if(checkbox1.isSelected())
		{
			System.out.println("checkbox is already selected");
		}
		else
		{
			checkbox1.click();
			System.out.println("chackbox is now selected");
		}
		
		
		
	}

}
