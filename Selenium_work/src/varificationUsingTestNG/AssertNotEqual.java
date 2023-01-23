package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void Assertnotequaluse() 
  {
	  //my TC should be passed when two things are not equal
	  
	  String A = "MH";
	  
	  String B = "Goa";
	  
	  Assert.assertNotEquals(A, B,"A and B are equal TC is failed");
	  
	  Reporter.log("TC is passed A and B are not matching", true);
  }
}
