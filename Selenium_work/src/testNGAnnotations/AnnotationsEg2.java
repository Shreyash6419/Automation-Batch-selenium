package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsEg2 {
  
	  @Test
	  public void ValidateUserID() 
	  {
		  Reporter.log("User Id validated", true);
	  }
	  
	  
	  @BeforeMethod
	  public void LoginToUpstox() 
	  {
		  Reporter.log("Upstox Login is done ---Part-1", true);
		 
	  }

	  @AfterMethod
	  public void LogoutUpstox() 
	  {
		  Reporter.log("Upstox Logout is done ---Part-2", true);
	  }

	  @BeforeClass
	  public void LaunchBrowser() 
	  {
		  Reporter.log("Browser launched ---BeforeClass", true);
	  }
	
	  @AfterClass
	  public void LogoutBrowser() 
	  {
		  Reporter.log("Browser closed ---AfterClass", true);  
	  }
}
