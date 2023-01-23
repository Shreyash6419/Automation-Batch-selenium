package listnersUse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnersUse.Listners.class)

public class TestNGListner1 {
  @Test
  public void test1() 
  {
	  Reporter.log("test1 is executing ", true);
  }
  @Test
  public void test2() 
  {
	  
	  Reporter.log("test2 is executing ", true);
	  Assert.fail();
  }
  @Test(dependsOnMethods = "test2")
  public void test3() 
  {
	  Reporter.log("test3 is executing ", true);
  }
}
