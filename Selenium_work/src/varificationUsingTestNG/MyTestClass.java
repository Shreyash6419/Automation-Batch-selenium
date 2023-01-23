package varificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void VerifyCheckBox() 
  {
	  System.setProperty("webdriver.chrome.driver","H:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  WebElement check1 = driver.findElement(By.id("checkBoxOption1"));
	  
	 // if(check1.isSelected())
	  //{
		//  Reporter.log("checkbox is selected TC is passed", true);
	  //}
	  //else
	  //{
		//  Reporter.log("checkbox is not selected Tc os falied ", true);
		  
	  //}
	  
	  check1.click();
	  
	  
	  Assert.assertTrue(check1.isSelected(),"TC is failed as checkbox option is not selected");
  }
}
