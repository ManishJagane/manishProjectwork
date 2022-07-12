package SoftAssertstudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertNullUse {
  @Test
  public void verifynull() 
  {
	  String a= "abc";
	  String b = null;
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertNull(a, "b is not null TC failed");
	  soft.assertNotNull(b, "b is a null value TC failed");
	 soft.assertAll();
  }
}
