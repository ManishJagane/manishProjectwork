package CrossBrowserTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import KiteBase.BaseNewCross;
import POMkite.kiteApplogIn;
import POMkite.kiteHomePage;
import POMkite.pinPagePOM;
import kiteUtility.UtilityProp;


public class validatekiteUserID2CrossBro extends BaseNewCross
{
	kiteApplogIn login;
	pinPagePOM pin;
	kiteHomePage home;
	//String TCID="14";
	
	
	@Parameters("BrowserName")
	@BeforeClass
	public void launchBrowser(String Bname) throws InterruptedException, IOException
	{
		if(Bname.equals("crome"))
		{
			openCromeBrowser();
		}
		else if(Bname.equals("firefox"))
		{
			openFirefoxBrowser();
		}
		
		login= new kiteApplogIn(driver);
		pin=new pinPagePOM(driver);
		home = new kiteHomePage(driver);
		
		Thread.sleep(2000);
		
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
	  Assert.assertEquals(home.getActualUsername(), UtilityProp.getDataFromPropertyfile("UN"),"Actual And Expected are not matched TC are failed");
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
