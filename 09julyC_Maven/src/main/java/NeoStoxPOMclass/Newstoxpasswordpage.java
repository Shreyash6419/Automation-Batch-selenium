package NeoStoxPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neoStoxUtilityclass.NeoStoxutilityPropertyFile;

public class Newstoxpasswordpage {
	
	
	//variable declaration 
	
	@FindBy(id="txt_accesspin")private WebElement passwordfield;
	
	@FindBy(id="lnk_submitaccesspin") private WebElement submitbutton;
	
	
	public Newstoxpasswordpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterpassword(WebDriver driver,String pass)
	{
		NeoStoxutilityPropertyFile.wait(driver, 1000);
		passwordfield.sendKeys(pass);
	}
	
	public void clickOnsubmitbutton(WebDriver driver)
	{
		NeoStoxutilityPropertyFile.wait(driver, 1000);
		submitbutton.click();
	}

}
