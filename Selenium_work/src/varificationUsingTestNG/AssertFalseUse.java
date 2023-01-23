package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseUse {
  @Test
  public void MyTC() 
  {
	  
	  boolean a = false;
	  
	  //TC should be passed If a is false
	  
	  Assert.assertFalse(a, "TC is false as A is True");
  }
}
