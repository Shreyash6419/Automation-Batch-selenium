package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass2 {
  @Test //Sigle Test Case // method
  public void Facebooktest() 
  {
	  System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("Facebook working fine");
		
		driver.get("https://www.facebook.com/");
  }
  
  @Test
  public void Googletest() 
  {
	  System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		Reporter.log("google serach page is working");
		
		driver.get("https://www.google.com/");
  }
  
  @Test
  
  public void redbustest()
  {
	  System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		Reporter.log("redbus homepage is working well");
		
		driver.get("https://www.redbus.in/");
  }
}
