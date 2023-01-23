package UpstoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelComePage {
	
	
	//Variable declration 
	
	@FindBy(xpath ="//div[text()='No,i am good']") private WebElement noIamGood;

	
	//Variable initialzation using Constructor ==pagefactory class and initelement method
	
	public UpstoxWelComePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//variable usage 
	 
	public void clickonGood()
	{
		noIamGood.click();
	}
}
