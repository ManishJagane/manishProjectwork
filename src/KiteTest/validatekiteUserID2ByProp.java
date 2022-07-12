package KiteTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import KiteBase.BaseNew1;
import POMkite.kiteApplogIn;
import POMkite.kiteHomePage;
import POMkite.pinPagePOM;
import kiteUtility.UtilityProp;


public class validatekiteUserID2ByProp extends BaseNew1
{
	kiteApplogIn login;
	pinPagePOM pin;
	kiteHomePage home;
	//String TCID="14";
	
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException, InterruptedException
	{
		login.sendUsername(UtilityProp.getDataFromPropertyfile("UN"));
		login.sendpassword(UtilityProp.getDataFromPropertyfile("PWD"));
		
		login.clickLogin();
		
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendkeyPin(UtilityProp.getDataFromPropertyfile("PIN"));
		pin.clickOnContinue();
		
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
	}
  @Test
  public void validateUserID() throws IOException 
  {
	  AssertJUnit.assertEquals(home.getActualUsername(), UtilityProp.getDataFromPropertyfile("UN"),"Actual And Expected are not matched TC are failed");
	  Reporter.log("Actual and Expected are matched TC passed", true);
	  
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
