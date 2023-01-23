package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTest 
{
	
	@Parameters("browserName")
	@Test
	public void launchbrowser(String bname) 
	{
	
	WebDriver driver = null;
		if(bname.equals("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
			  
			  driver = new ChromeDriver();
		}
		
		else if(bname.equals("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver","H:\\selenium\\Gecodriver_win32\\geckodriver.exe");
			  
			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://login.upstox.com/");
		
		
		
	}
}
