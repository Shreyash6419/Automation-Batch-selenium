package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupPage2 {
  
  @Test(groups = "regression")
  public void TC6() 
  {
	  Reporter.log("TC6 Regression is running", true);
  }
  
  @Test(groups = "sanity")
  public void TC7() 
  {
	  Reporter.log("TC7 sanity is running", true);
  }
  
  @Test(groups = "regression")
  public void TC8() 
  {
	  Reporter.log("TC8 Regression is running", true);
  }
  
  @Test(groups = "sanity")
  public void TC9() 
  {
	  Reporter.log("TC9 Sanity is running", true);
  }
  @Test
  public void TC10() 
  {
	  Reporter.log("TC10 running", true);
  }
}
