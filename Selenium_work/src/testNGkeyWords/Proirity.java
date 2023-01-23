package testNGkeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Proirity {
  @Test(priority = 1)  // priority will be given from negative to positive direction  
  public void A()
  {
	  Reporter.log("Tc A is executed", true);
  }
  
  @Test
  public void C() 
  {
	  Reporter.log("Tc C is executed", true);
  }
  
  @Test
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
