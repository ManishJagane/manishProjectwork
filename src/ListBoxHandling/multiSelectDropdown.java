package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement multidropdown = driver.findElement(By.xpath("//select[@id='second']"));
		Thread.sleep(1000);
		Select s= new Select(multidropdown);
		
		
		
		System.out.println("Multiple select is "+s.isMultiple());
		
		s.selectByValue("pizza");
		Thread.sleep(100);
		s.selectByIndex(2);
		Thread.sleep(100);
		s.selectByVisibleText("Donut");
		Thread.sleep(100);
		s.selectByIndex(3);
		
		Thread.sleep(1000);
//		s.deselectAll();
		
		s.deselectByIndex(3);
		Thread.sleep(100);
		s.deselectByVisibleText("Donut");
		Thread.sleep(100);
		s.deselectByValue("burger");
		Thread.sleep(100);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		
		
		
	}

}
