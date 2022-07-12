package popupHandlig;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String mainpageID = driver.getWindowHandle();
		System.out.println(mainpageID);
		System.out.println("----------------");
		
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allpageid = driver.getWindowHandles();
		Iterator<String> itr = allpageid.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		String mainpage = itr.next();
		String child1 = itr.next();
		
		
		//  switch the focus from main page to child page
		
		driver.switchTo().window(child1);
		Thread.sleep(1000);
	
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		driver.manage().window().minimize();
		
		driver.switchTo().window(mainpage);
		WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
		
		System.out.println(text.getText());
		
		driver.switchTo().window(child1);
		driver.manage().window().maximize();
		
		WebElement text2 = driver.findElement(By.xpath("//h1"));
		System.out.println(text2.getText());
		
		
		

	}

}
