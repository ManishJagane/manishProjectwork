package verificationAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asserttrueUse {
  @Test
  public void verifyTrue() 
  {
	  
	  boolean b1= true;
	  boolean b2= false;
	  
//	  Assert.assertTrue(b2, "b1 is not true TC failed");
//	  Reporter.log("b1 is true TC passed");
//	  
	  Assert.assertFalse(b1, "b2 is not false tc failed");
	  Reporter.log("b2 is false tc passed");
  }
}
