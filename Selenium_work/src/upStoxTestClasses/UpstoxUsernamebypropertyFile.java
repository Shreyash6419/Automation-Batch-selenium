package upStoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UpStoxUtility.utilityPropertyFIle;
import upStoxBase.Base_propetyFile;
import upStoxPOMClassesTESTNG.UpstoxHomePageExcel;
import upStoxPOMClassesTESTNG.UpstoxLoginpageExcel;
import upStoxPOMClassesTESTNG.UpstoxPasscodeExcel;
import upStoxPOMClassesTESTNG.UpstoxWelComePage;

public class UpstoxUsernamebypropertyFile extends Base_propetyFile {
	
	UpstoxLoginpageExcel login;
	UpstoxPasscodeExcel passcode;
	
	UpstoxWelComePage welcome;
	UpstoxHomePageExcel home;
	
	String TCID = "1005";
	
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		launchBrowser();
		Reporter.log("Launching Browser", true);
		login = new UpstoxLoginpageExcel(driver);
		passcode = new UpstoxPasscodeExcel(driver);
		welcome = new UpstoxWelComePage(driver);
		home = new UpstoxHomePageExcel(driver);
		
	}
	
	@BeforeMethod
	public void logintoUpstox() throws IOException
	{
		login.enteruserID(utilityPropertyFIle.readDataFromPropertyFile("userID"));
		login.enterpassword(utilityPropertyFIle.readDataFromPropertyFile("password"));
		Reporter.log("entered userID and Password", true);
		login.ClickonSigninbutton();
		utilityPropertyFIle.wait(driver, 500);
		passcode.EnterPassCode(utilityPropertyFIle.readDataFromPropertyFile("passcode"));
		utilityPropertyFIle.wait(driver, 500);
		welcome.clickonGood();
	}
	
	
  @Test
  public void ValidateUserID() throws IOException 
  {
	  Assert.assertEquals(home.getActualuserID(),utilityPropertyFIle.readDataFromPropertyFile("expUserName"));
	  
	  utilityPropertyFIle.screenshot(driver,TCID);
	  
  }
  
  @AfterMethod
  public void logoutUserID() throws InterruptedException 
  {
	  home.SwitchTologut(driver);
	  
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
  

  
  
  
  
  
}
