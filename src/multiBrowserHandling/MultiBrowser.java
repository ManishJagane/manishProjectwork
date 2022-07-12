package multiBrowserHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		WebElement tryit = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]"));
		
		tryit.click();
		Thread.sleep(1000);
		tryit.click();
		tryit.click();
		
		Thread.sleep(1000);
		
		Set<String> allpageID = driver.getWindowHandles();

		Iterator<String> ids = allpageID.iterator();
//		
//		while(ids.hasNext())
//		{
//			System.out.println(ids.next());
//		}
		
		String mainpageid = ids.next();
		String child1 = ids.next();
		String child2 = ids.next();
		String child3 = ids.next();
		
		driver.switchTo().window(child1);
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		Thread.sleep(200);
		driver.switchTo().window(child2);
		Thread.sleep(200);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		Thread.sleep(200);
		driver.switchTo().window(child3);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		Thread.sleep(200);
		
		driver.switchTo().window(mainpageid);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

	

	}

}
