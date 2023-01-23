package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass1 {
  @Test
  public void f()
  {
	  System.setProperty("webdriver,chrome,driver","H:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  Reporter.log("paytm working fine");
	  
	  driver.get("https://paytm.com/");
	  
  }
}
