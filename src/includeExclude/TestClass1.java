package includeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void a() 
  {
	  Reporter.log("A is running", true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("B is running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("c is running", true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("D is running", true);
  }
  
}
