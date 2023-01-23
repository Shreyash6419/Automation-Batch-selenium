package neoStoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxPOM.NewStoxHomepage;
import NeoStoxPOM.NewStoxLoginPage;
import NeoStoxPOM.Newstoxpasswordpage;
import NeoStoxUtility.NeoStoxutilityPropertyFile;
import upStoxBase.Base_propetyFile;

public class ValidateUserNameNeoStox extends Base_propetyFile {
	
	NewStoxLoginPage login;
	Newstoxpasswordpage password;
	NewStoxHomepage home;

	
	@BeforeClass
	public void LaunchNewstox() throws IOException
	{
		launchBrowser();
		
		login = new NewStoxLoginPage(driver);
		password = new Newstoxpasswordpage(driver);
		home= new NewStoxHomepage(driver);
	}
	
	@BeforeMethod
	public void signInToNeoStox() throws IOException, InterruptedException
	{
		login.enterMobileNumber(driver, NeoStoxutilityPropertyFile.readDataFromPropertyFile("MobNum"));
		login.ClickonSigninbutton(driver);
		password.enterpassword(driver, NeoStoxutilityPropertyFile.readDataFromPropertyFile("password"));
		password.clickOnsubmitbutton(driver);
		Thread.sleep(1000);
		home.handlePopUp(driver);
	}
	
	
  @Test
  public void validateusername() throws IOException 
  {
	Assert.assertEquals(home.getusername(),NeoStoxutilityPropertyFile.readDataFromPropertyFile("expUserName"),"TC Failed,actual and expected name not matching");
  }
  
  @AfterMethod
  public void logOutNeostox()
  {
	  home.logoutfromApp(driver);
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
