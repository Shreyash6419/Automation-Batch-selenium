package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestingGrup1 {
  @Test(groups = {"homePage","funds"})
  public void A() 
  {
	  Reporter.log("Test case A is Running", true);
  }
  
  @Test(groups = "funds")
  public void B() 
  {
	  Reporter.log("Test case B is Running", true);
  }
  @Test(groups = "homePage")
  public void C() 
  {
	  Reporter.log("Test case C is Running", true);
  }
  @Test(groups = "funds")
  public void D() 
  {
	  Reporter.log("Test case D is Running", true);
  }
  
  @Test(groups = "homePage")
  public void E() 
  {
	  Reporter.log("Test case E is Running", true);
  }
}
