package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import scrolling.ScrollingFuncation;

public class UpstoxHomePage {
	
	// variable declration 
	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement UserID;
	
	@FindBy(id="funds") private WebElement Fundtab;
	
	@FindBy(xpath="//div[text()='Logout']") private WebElement logout;
	
	//variable initialization using Constructor ---. Pagefactory class -- initelement method
	
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//variable usage 
	
	public void ValidateUserID(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		ScrollingFuncation.scrollintoView(driver, UserID);
		
		String ActualUserId=UserID.getText();
		
		String ExistingUser="Shreyash k.";
		if(ExistingUser.equals(ActualUserId))
		{
			System.out.println("Actual and Existing user Id is same and Test Case Passed");
		}
		
		else
		{
			System.out.println("Actual and Existing user Id is not same and Test Case failed");
		}
		
	}
		
		//variable usage 
		
	public void ClickOnFund(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(1000);
		ScrollingFuncation.scrollintoView(driver,Fundtab );
		Fundtab.click();
	}
	
	public void SwitchTologut(WebDriver driver) throws InterruptedException
	{
		ScrollingFuncation.scrollintoView(driver, UserID);
		UserID.click();
		Thread.sleep(500);
		logout.click();
	}
	
	
} 	


