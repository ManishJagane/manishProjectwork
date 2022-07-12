package verificationAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertUsa {
  @Test
  public void assertEqualsuse() 
  {
	 String a="Nagpur";
	 String b= "Nagpur1";
	 
//	 Assert.assertEquals(a, b, "a and b are not equal TC failed");
//	 Reporter.log("a and b are equal TC passed");
	 
	 Assert.assertNotEquals(a, b, "A and  b are equal tc failed");
	 Reporter.log("a and b are not same tc passes");
	 
	 
  }
}
