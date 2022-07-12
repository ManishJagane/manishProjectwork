package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		//to drag and drop action we need to use action class
		
		//create action class object
		
		Actions act= new Actions(driver);
		
		// Action class perform desire action 
	    Thread.sleep(1000);
		act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		Thread.sleep(1000);
		//act.dragAndDrop(source, destination).perform();
		
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.moveToElement(source2).clickAndHold().moveToElement(dest1).release().build().perform();
		
		Thread.sleep(2000);
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dest2 = driver.findElement(By.id("loan"));
		
		act.moveToElement(source3).clickAndHold().moveToElement(dest2).release().build().perform();
		
		Thread.sleep(1000);

		WebElement source4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest3 = driver.findElement(By.id("amt8"));
		
		
		act.moveToElement(source4).clickAndHold().moveToElement(dest3).release().build().perform();
		

	}
}
