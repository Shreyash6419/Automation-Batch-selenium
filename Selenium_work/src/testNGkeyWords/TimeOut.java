package testNGkeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	  @Test//(enabled = false)
	  public void A()
	  {
		  Assert.fail();
		  Reporter.log("Tc A is executed", true);
	  }
	  
	  @Test(dependsOnMethods = {"D"})
	  public void C() 
	  {
		  Reporter.log("Tc C is executed", true);
	  }
	  
	  @Test(dependsOnMethods = {"C"})
	  public void B() throws InterruptedException 
	  {
		
		  Reporter.log("Tc B is executed", true);
	  }
	  
	  @Test (dependsOnMethods = {"A"})
	  public void D() 
	  {
		  Reporter.log("Tc D is executed", true);
	  }
}
