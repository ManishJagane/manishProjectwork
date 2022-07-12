package TestNGkyeword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableKeyword {
  @Test
  public void a() 
  {
	  Reporter.log("A method running", true);
  }
  @Test ( enabled = false)
  public void b()
  {
	  Reporter.log("B metthod running", true);
  }
  
  @Test (enabled = true)
  public void c()
  {
	  Reporter.log("C method runnig", true);
  }
}
