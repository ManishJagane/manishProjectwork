package kitePOMusingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatekiteUserName 
{
	WebDriver driver;
	Sheet mysheet;
	kiteApplogIn login;
	pinPagePOM pin;
	kiteHomePage home;
	
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myfile= new File("D:\\Selenium\\kitetest3.xlsx");
		mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		login= new kiteApplogIn(driver);
		pin =new pinPagePOM(driver);
		home= new kiteHomePage(driver);

		
	}
	@BeforeMethod
	public void loginTokite() throws InterruptedException
	{
		
		 String UID = mysheet.getRow(1).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
		 String PN = mysheet.getRow(1).getCell(2).getStringCellValue();
		 
		login.sendUsername(UID);
		login.sendpassword(PWD);
		login.clickLogin();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		Thread.sleep(1000);
		pin.sendkeyPin(PN);
		pin.clickOnContinue();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Thread.sleep(1000);
		
	}
  @Test
  public void validateUserName() 
  {
		 String expectedUID = mysheet.getRow(1).getCell(0).getStringCellValue();
		 String actualUID= home.getActualUsername();
		 
		 Assert.assertEquals(actualUID, expectedUID, "Actual an Expected UN are not matched TC failed");
		 Reporter.log("Actual and Expected Are matched TC is passed");

  }
  
  @AfterMethod
  public void logoutFromKite() throws InterruptedException
  {
	  home.LogOut();
	  
  }
  @AfterClass
  
  
  public void BrowserClose() throws InterruptedException
  {
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
 }
}
