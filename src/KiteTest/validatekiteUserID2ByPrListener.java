package KiteTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteBase.BaseNewByListener;
import POMkite.kiteApplogIn;
import POMkite.kiteHomePage;
import POMkite.pinPagePOM;
import kiteUtility.UtilityProp;
import kiteUtility.UtilityPropListener;
 
@Listeners(kiteUtility.listener2.class)

public class validatekiteUserID2ByPrListener extends BaseNewByListener
{
	kiteApplogIn login;
	pinPagePOM pin;
	kiteHomePage home;
	//String TCID="14";
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException, IOException
	{
		openBrowser();
		login= new kiteApplogIn(driver);
		pin=new pinPagePOM(driver);
		home = new kiteHomePage(driver);
		
		//Thread.sleep(2000);
		UtilityPropListener.waitForProcess(2000);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException, InterruptedException
	{
		login.sendUsername(UtilityProp.getDataFromPropertyfile("UN"));
		login.sendpassword(UtilityProp.getDataFromPropertyfile("PWD"));
		
		login.clickLogin();
		UtilityPropListener.waitForProcess(2000);

		
		pin.sendkeyPin(UtilityProp.getDataFromPropertyfile("PIN"));
		pin.clickOnContinue();
		UtilityPropListener.waitForProcess(2000);

	}
  @Test
  public void validateUserID() throws IOException 
  {
	  Assert.assertEquals(home.getActualUsername(), UtilityProp.getDataFromPropertyfile("UN"),"Actual And Expected are not matched TC are failed");
	  Reporter.log("Actual and Expected are matched TC passed", true);
	  //Utility.captureScreenshot(driver, TCID);
	  Assert.fail();
  }
  @AfterMethod
  public void logoutFromeKite() throws InterruptedException
  {
		UtilityPropListener.waitForProcess(2000);

	  home.LogOut();
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
		UtilityPropListener.waitForProcess(2000);
	  driver.close();
  }
}
