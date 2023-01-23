package NeoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NeoStoxUtility.NeoStoxutilityPropertyFile;

public class NewStoxLoginPage {
	
	@FindBy(id="lnk_signup1") private WebElement mobilNumFiled;
	@FindBy(id="lnk_signup1") private WebElement signIN;


public NewStoxLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterMobileNumber(WebDriver driver,String mobnum)
{
	NeoStoxutilityPropertyFile.wait(driver, 1000);
	mobilNumFiled.sendKeys(mobnum);
}

public void ClickonSigninbutton(WebDriver driver)
{
	
	signIN.click();
	NeoStoxutilityPropertyFile.wait(driver, 1000);
}
}

