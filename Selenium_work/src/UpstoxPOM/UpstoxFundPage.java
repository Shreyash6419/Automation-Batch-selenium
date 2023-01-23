package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxFundPage {
	
	//variable decleration
	
	@FindBy(xpath ="((//div[@class='_2Bthrplw1vYHfLZZqV'])[1]//div)[3]") private WebElement AvailableFund;
	
	//variable initialization using construtor ===> pagefactory class ==> initElement methods 
	
	public UpstoxFundPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void checkfunds()
	{
		String myFunds = AvailableFund.getText();
		
		System.out.println("Available fund for trading:"+myFunds);
	}

}
