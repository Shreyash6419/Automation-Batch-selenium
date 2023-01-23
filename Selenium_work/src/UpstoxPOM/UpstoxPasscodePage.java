package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage {
	
	//variable declearation-- 1st Phase 
	
	@FindBy(name="yob") private WebElement Passcode;
	
	
	//Variable initialization(constructor --> Pagefactory class. intinElement method 
	
	public UpstoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Usage (variable methods --> Actions)
	
	public void EnterPassCode()
	{
		Passcode.sendKeys("2000");
	}

}
