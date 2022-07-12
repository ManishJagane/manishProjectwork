package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerStudy.Listener1.class)
public class Test1 {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("Running myMethod1", true);
  }
  @Test
  public void myMethod2() 
  {
	  Reporter.log("Running myMethod2", true);
	  Assert.fail();
  } 
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("Running myMethod3", true);
  }
  @Test
  public void myMethod4() 
  {
	  Reporter.log("Running myMethod4", true);
  }
}
