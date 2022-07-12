package WebDriverStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		
		//Driver.close();
		//Driver.quit();
		Driver.manage().window().maximize();
		//Driver.close();
		//Driver.manage().window().minimize();
	
		//Navigate method 
		
//		Driver.navigate().to("https://www.google.com/");
//		Thread.sleep(1000);
//		
//		Driver.navigate().back(); //to go to  back from recent page
//		Thread.sleep(1000);
//		Driver.navigate().forward(); //to go to forward page 
//		
		
		//6. getTitle method
		System.out.println(Driver.getTitle());
		String title = Driver.getTitle(); // to stored in variable
		System.out.println(title);
		
		//7. getCurrentUrl() method 
		System.out.println(Driver.getCurrentUrl());
		 String url = Driver.getCurrentUrl();
		 System.out.println(url);
		
		
		
		

	}

}
