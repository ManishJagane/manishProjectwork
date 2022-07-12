package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAlLinks {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		Iterator<WebElement> lnk = links.iterator();
		
		while(lnk.hasNext())
		{
			System.out.println(lnk.next().getText());
		}
		System.out.println("==================");
		
		List<WebElement> tbl = driver.findElements(By.tagName("table"));
		System.out.println(tbl.size());
		
		

	}

}
