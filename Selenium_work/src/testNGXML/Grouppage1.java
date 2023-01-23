package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouppage1 {
  @Test (groups = "regression")
  public void TC1() 
  {
	  Reporter.log("TC1 Regression is running", true);
  }
  
  @Test(groups = "sanity")
  public void TC2() 
  {
	  Reporter.log("TC2 sanity is running", true);
  }
  
  @Test(groups = "regression")
  public void TC3() 
  {
	  Reporter.log("TC3 Regression is running", true);
  }
  
  @Test(groups = "sanity")
  public void TC4() 
  {
	  Reporter.log("TC4 Sanity is running", true);
  }
  @Test
  public void TC5() 
  {
	  Reporter.log("TC5 running", true);
  }
}
