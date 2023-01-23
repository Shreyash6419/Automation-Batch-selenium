package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestingGrup2 {
  @Test (groups = "funds")
  public void F() 
  {
	  Reporter.log("Test case A is Running", true);
  }
  
  @Test (groups = "homePage")
  public void G() 
  {
	  Reporter.log("Test case B is Running", true);
  }
  @Test (groups = "funds")
  public void H() 
  {
	  Reporter.log("Test case C is Running", true);
  }
  @Test (groups = "homePage")
  public void I() 
  {
	  Reporter.log("Test case D is Running", true);
  }
  
  @Test (groups = "homePage")
  public void J() 
  {
	  Reporter.log("Test case E is Running", true);
  }
}
