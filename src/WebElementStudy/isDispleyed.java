package WebElementStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDispleyed {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		
		 WebElement show = driver.findElement(By.id("show-textbox"));
		 
		 WebElement textbox = driver.findElement(By.id("displayed-text"));
		 
//		 hide.click();
//		 System.out.println(textbox.isDisplayed());
//		
		if(textbox.isDisplayed())
		{
			System.out.println("textbox is visible ");
		}
		else {
			System.out.println("textbox is not visible, click on show button ");
			
		}
		
		hide.click();
		
		if(textbox.isDisplayed())
		{
			System.out.println("textbox is visible ");
			
		}
		else {
			System.out.println("textbox i not visible, click show button");
			
		}
		show.click();

	}

}
