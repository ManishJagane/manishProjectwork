package TestNGkyeword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test (invocationCount = 4)
  public void MyMethod() 
  {
	  Reporter.log("Hi this is method by using invacation Count keyWord", true);
  }
   @BeforeMethod 
  public void test()
  {
	   Reporter.log("login successfull", true);
	  
  }
}
