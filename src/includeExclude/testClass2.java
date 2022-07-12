package includeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testClass2 {
  @Test
  public void p() 
  {
	  Reporter.log("p is running " ,true);
  }
  
  
  @Test
  public void q() 
  {
	  Reporter.log("Q is running " ,true);
  }
  @Test
  public void r() 
  {
	  Reporter.log("R is running " ,true);
  }
  @Test
  public void s() 
  {
	  Reporter.log("s is running " ,true);
  }
  
}
