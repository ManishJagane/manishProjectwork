package TestNGkyeword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class priority {
  @Test
  public void ab()
  {
	  Reporter.log(" method A");
  }
  @Test (priority = -2)
  public void bc()
  {

	  Reporter.log("method BC");
	  
  }
  @Test(priority = -1)
  public void cd()
  {
	  Assert.fail();
	  Reporter.log("Method CD");
  }
  
}
