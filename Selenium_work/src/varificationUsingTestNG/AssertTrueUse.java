package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void Trueuse() 
  {
	  boolean a = true;
	  // iF A is True then TC should be passed
	  
	  Assert.assertTrue(a,"Test Case is failed:- A is false");
	  Reporter.log("TC is passed A is True", true);
	  
	  
  }
}
