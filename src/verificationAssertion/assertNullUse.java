package verificationAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNullUse {
  @Test
  public void verifyNull() 
  {
	  String a= null;
	  String b= "pune";
	  
	  Assert.assertNull(a, "a is not null TC failed");
	  Reporter.log("value is null TC pass", true);
	  
	  Assert.assertNotNull(b, "b is null TC is failed ");
	  Reporter.log("b is not null TC passed",true);
  }
}
