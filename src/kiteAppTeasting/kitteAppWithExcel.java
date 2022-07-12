package kiteAppTeasting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitteAppWithExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//by using excel sheet data 
		File myfile= new File("D:\\Selenium\\kitetest3.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		  String UID = mysheet.getRow(1).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
		 String PN = mysheet.getRow(1).getCell(2).getStringCellValue();
		 
		
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[text()='Login ']"));
		
		userID.sendKeys(UID);
		password.sendKeys(PWD);
		login.click();
		
		Thread.sleep(5000);
		
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[text()='Continue ']"));
		
		pin.sendKeys(PN);
		continuebutton.click();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualID = username.getText();
		
		String expectedID=UID;
		
		if(actualID.equals(expectedID))
		{
			System.out.println("User ID matching TC is PASSED");
		}
		else {
			System.out.println("User ID Not matching TC is failed");
		}
		
		username.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
	
	}

}
