package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertfailsUse {
  @Test
  public void FailUse() 
  {
	  // to reduce length of test script we need to use Assert class for varification which contains static method 
	  //all the static method should be imported from org.TestNg
	  // if we want fail any TC case even though it is correct then use Assert.fail
	  
	  Assert.fail();
  }
}
