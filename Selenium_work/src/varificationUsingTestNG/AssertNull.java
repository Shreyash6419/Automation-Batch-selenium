package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void NullUse() 
  {
	  String a = null;
	  
	  //TC is passed if a is NUll
	  
	  Assert.assertNull(a, "TC is failed as a is not null");
	  
  }
}
