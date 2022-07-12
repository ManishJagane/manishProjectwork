package testNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test
  public void validedUserid() 
  {
	  Reporter.log("Hii username validate ", true);
	  
  }
  @Test
  public void test2()
  {
	  Reporter.log("This is test 2 method ", true);
  }
  
  @BeforeMethod
  public void logIn() 
  {
	  Reporter.log("Hii login successfull ", true);
  }

  @AfterMethod
  public void logout() 
  {
	  Reporter.log("LogOut successfull", true);
  }

  @BeforeClass
  public void launchbrowser() 
  {
	  Reporter.log("browser launched", true );
  }
 
  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Browser Closed", true);
  }

}
