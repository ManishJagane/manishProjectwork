package TestNGkyeword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependOnmethod {
  @Test(dependsOnMethods = {"Method3", "Method4"})
  public void Method1() 
  {
	  Reporter.log("method1 work fine", true);
  }
  @Test
  public void Method2() 
  {
	  Reporter.log("method2 work fine", true);
  }
  @Test(priority = -1)
  public void Method3() 
  {
	  Reporter.log("method3 work fine", true);
  }
  @Test
  public void Method4() 
  {
	  Reporter.log("method4 work fine", true);
  }
}
