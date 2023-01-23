package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GeckoTest {
  @Test
  public void fireFoxTest() 
  {
	  System.setProperty("webdriver.gecko.driver","H:\\selenium\\Gecodriver_win32\\geckodriver.exe");
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  Reporter.log("paytm working fine",true);
	  
	  driver.get("https://paytm.com/");
	  
	  
  }
}
