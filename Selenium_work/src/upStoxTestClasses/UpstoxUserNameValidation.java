package upStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UpStoxUtility.UtilityNew;
import upStoxBase.Base;
import upStoxPOMClassesTESTNG.UpstoxFundPageExcel;
import upStoxPOMClassesTESTNG.UpstoxHomePageExcel;
import upStoxPOMClassesTESTNG.UpstoxLoginpageExcel;
import upStoxPOMClassesTESTNG.UpstoxPasscodeExcel;
import upStoxPOMClassesTESTNG.UpstoxWelComePage;

public class UpstoxUserNameValidation extends Base{
	
	UpstoxLoginpageExcel login;
	UpstoxPasscodeExcel passcode;
	UpstoxWelComePage welcome;
	UpstoxHomePageExcel home;
	UpstoxFundPageExcel funds;
	String TCID = "1224";
	
	@BeforeClass
	public void OpenBrowser()
	{
		launchBrowser();
		Reporter.log("Launching Browser", true);
		login=new UpstoxLoginpageExcel(driver);
		passcode = new UpstoxPasscodeExcel(driver);
		welcome= new UpstoxWelComePage(driver);
		home=new UpstoxHomePageExcel(driver);
		funds = new UpstoxFundPageExcel(driver);
		
		
	}
	@BeforeMethod
	public void LoginTOUpstox() throws EncryptedDocumentException, IOException
	{
		login.enteruserID(UtilityNew.readDataFromExcel(1, 0));
		login.enterpassword(UtilityNew.readDataFromExcel(1, 1));
		login.ClickonSigninbutton();
		UtilityNew.wait(driver, 500);
		Reporter.log("seding username and password", true);
		passcode.EnterPassCode(UtilityNew.readDataFromExcel(1, 2));
		UtilityNew.wait(driver, 500);
		welcome.clickonGood();
		UtilityNew.wait(driver, 500);
	}
	
  @Test
  public void ValidateUseID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getActualuserID(),UtilityNew.readDataFromExcel(1, 3));
	  UtilityNew.wait(driver, 500);
	  UtilityNew.screenshot(driver,TCID);
  }
  
  @AfterMethod
  public void logoutFromUpstox() throws InterruptedException
  {
	  home.SwitchTologut(driver);
	  Reporter.log("logout form app.....", true);
	  
  }
  
  @AfterClass
  
  public void closebrowser()
  {
	  driver.close();
	  UtilityNew.wait(driver, 500);
  }
 
  
  
  
}







