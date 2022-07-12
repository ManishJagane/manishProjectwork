package MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_1st_selenium_code {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#");
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi there");

	}
	

}
