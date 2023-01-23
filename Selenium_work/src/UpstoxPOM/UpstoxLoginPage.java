package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage
{
	//variable declearation 
	
	@FindBy(name="userID") private WebElement userID;
	
	@FindBy(name="password") private WebElement Password;
	
	@FindBy(xpath ="//div[text()='sign into Upstox']") private WebElement SignIn;
	
	//variable initilization 
	
	public UpstoxLoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this); // initElement menthod is used to initialze the webelement present on webpage
	}

	//variable usage
	
	public void enteruserID() {
		userID.sendKeys("GVBXJN");
		
	}
	
	public void enterpassword() {
		
		Password.sendKeys("F+ESONF45");
	}
	
	public void ClickonSigninbutton()
	{
		SignIn.click();
	}
	
}







