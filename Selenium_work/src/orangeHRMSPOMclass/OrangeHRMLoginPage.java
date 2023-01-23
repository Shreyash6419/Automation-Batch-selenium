package orangeHRMSPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
	
	//variable declaration
	
	@FindBy(name="username") private WebElement userName;
	
	@FindBy(name="password")private WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;

	
	public OrangeHRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void EnterUserName(String un)
	{
		userName.sendKeys(un);
	}
	
	public void EnterPassWord(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	public void ClickonsubmitButton()
	{
		loginButton.click();
	}
	
	
	
}
