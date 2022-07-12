package popupHandlig;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alartHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(100);
		driver.manage().window().maximize();
		driver.findElement(By.id("alertBox")).click();
		//change focus of selenium from page to alert box
		// To change the focus-->
		 Alert alt = driver.switchTo().alert();
		 Thread.sleep(100);
		 
		 System.out.println(alt.getText());
		 alt.accept();
		
		driver.findElement(By.id("confirmBox")).click();
		Alert alt2 = driver.switchTo().alert();
		//alt2.dismiss();
		System.out.println(alt2.getText());
		Thread.sleep(100);
		alt2.accept();
		
		//alert 3
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(100);
		
		Alert alt3 = driver.switchTo().alert();
		System.out.println(alt3.getText());
		alt3.sendKeys("Manish");
		alt3.accept();
		
		
	}

}
