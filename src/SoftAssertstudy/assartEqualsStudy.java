package SoftAssertstudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assartEqualsStudy {
  @Test
  public void verifyequals() 
  {
	  String a= "Nagpur";
	  String b= "Nagpu1r";
	  
	  SoftAssert soft= new SoftAssert();
	  soft.assertEquals(a, b, "a and b are not same TC failed");
	  soft.assertNull(b, "no null value TC failed");
	  soft.assertAll();
	  
  }
}
