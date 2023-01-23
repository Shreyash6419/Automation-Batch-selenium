package listnersUse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnersUse.Listners.class)

public class TestNGListner2 {
  @Test
  public void test4() 
  {
	  Reporter.log("test4 is executing ", true);
  }
  @Test
  public void test5() 
  {
	  
	  Reporter.log("test5 is executing ", true);
	  Assert.fail();
  }
  @Test(dependsOnMethods = "test5")
  public void test6() 
  {
	  Reporter.log("test6 is executing ", true);
  }
}
