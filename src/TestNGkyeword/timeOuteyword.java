package TestNGkyeword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOuteyword {
  @Test(timeOut = 1000)
  public void ab() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  Reporter.log("ab method run ", true);
  }
  @Test 
  public void cd()
  {
	  Reporter.log("cd method run", true);
  }
}
