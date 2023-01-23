package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void NotNullUse() 
  
  {
	  
	  String a = "kiaan";
	  
	  // Tc is passsed if A is not null
	  
	  Assert.assertNotNull(a, "TC is failed as a is having null");
  }
}
