package testNGkeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	  @Test(priority = 1)
	  public void A()
	  {
		  Reporter.log("Tc A is executed", true);
	  }
	  
	  @Test
	  public void C() 
	  {
		  Reporter.log("Tc C is executed", true);
	  }
	  
	  @Test(enabled = false)
	  public void B() 
	  {
		  Reporter.log("Tc B is executed", true);
	  }
	  
	  @Test(priority =-1)
	  public void D() 
	  {
		  Reporter.log("Tc D is executed", true);
	  }
}
