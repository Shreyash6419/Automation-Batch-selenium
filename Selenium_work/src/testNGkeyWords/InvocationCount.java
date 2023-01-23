package testNGkeyWords;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {


@Test(invocationCount = 5)
  public void LogintoApplication() 
  {
	  Reporter.log("login to App is done",true);
  }
}
