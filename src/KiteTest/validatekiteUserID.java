package KiteTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import POMkite.kiteApplogIn;
import POMkite.kiteHomePage;
import POMkite.pinPagePOM;
import kiteUtility.Utility;

public class validatekiteUserID extends Base 
{
	kiteApplogIn login;
	pinPagePOM pin;
	kiteHomePage home;
	String TCID="1234";
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		openBrowser();
		login= new kiteApplogIn(driver);
		pin=new pinPagePOM(driver);
		home = new kiteHomePage(driver);
		
		Thread.sleep(2000);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.sendUsername(Utility.readDataFromExcel(1, 0));
		login.sendpassword(Utility.readDataFromExcel(1, 1));
		
		login.clickLogin();
		
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendkeyPin(Utility.readDataFromExcel(1, 2));
		pin.clickOnContinue();
		
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getActualUsername(), Utility.readDataFromExcel(1, 0),"Actual And Expected are not matched TC are failed");
	  Reporter.log("Actual and Expected are matched TC passed", true);
	  Utility.captureScreenshot(driver, TCID);
  }
  @AfterMethod
  public void logoutFromeKite() throws InterruptedException
  {
	  home.LogOut();
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.close();
  }
}
