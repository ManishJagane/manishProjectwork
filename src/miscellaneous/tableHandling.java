package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableHandling {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> totalrow = driver.findElements(By.xpath("//table//tr"));
		System.out.println("Total No. row in table is "+totalrow.size());
		
		// to find total no. of column
		List<WebElement> totalcol = driver.findElements(By.xpath("//table//tr[1]//th"));
		System.out.println("Total colunm in a table is "+totalcol.size());
		
		System.out.println("===================");
		
		//to read table header 
		
		for(WebElement header:totalcol)
		{
			System.out.print(header.getText()+ "   ");
		}
		System.out.println();
		
		 List<WebElement> allrow = driver.findElements(By.xpath("//table//tr"));
		//System.out.println(row1.getText());
		
		 Iterator<WebElement> it = allrow.iterator();
		 while(it.hasNext())
		 {
			 System.out.print(it.next().getText()+"  ");
			 
			 System.out.println();
		 }
		 
		

	}

}
