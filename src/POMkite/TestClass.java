package POMkite;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		File myfile= new File("D:\\Selenium\\kitetest3.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		  String UID = mysheet.getRow(1).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
		 String PN = mysheet.getRow(1).getCell(2).getStringCellValue();
		 

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		Thread.sleep(1000);
		
		kiteApplogIn login = new kiteApplogIn(driver);
		login.sendUsername(UID);
		login.sendpassword(PWD);
		login.clickLogin();
		
		Thread.sleep(2000);
		
		pinPagePOM pinpage= new pinPagePOM(driver);
		pinpage.sendkeyPin(PN);
		pinpage.clickOnContinue();
		
		Thread.sleep(2000);
		
		kiteHomePage home= new kiteHomePage(driver);
		home.validateUsername(UID);
		home.LogOut();
		
		driver.close();
	

	}

}
