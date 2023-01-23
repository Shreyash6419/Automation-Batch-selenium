package UpstoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginpageExcel {
	
	//variable declearation 
	
		@FindBy(name="userID") private WebElement userID;
		
		@FindBy(name="password") private WebElement Password;
		
		@FindBy(xpath ="//div[text()='sign into Upstox']") private WebElement SignIn;
		
		//variable initilization 
		
		public UpstoxLoginpageExcel(WebDriver driver)
		
		{
			PageFactory.initElements(driver,this); // initElement menthod is used to initialze the webelement present on webpage
		}

		//variable usage
		
		public void enteruserID(String ui) {
			userID.sendKeys(ui);
			
		}
		
		public void enterpassword(String ps) {
			
			Password.sendKeys(ps);
		}
		
		public void ClickonSigninbutton()
		{
			SignIn.click();
		}
		

}
