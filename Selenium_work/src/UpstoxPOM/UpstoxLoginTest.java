package UpstoxPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// Create an object of Upstoxloginpage
		
		UpstoxLoginPage login = new UpstoxLoginPage(driver); // here we pass paramenter bcz we want open in chrome browser
		
		login.enteruserID();
		
		login.enterpassword();
		
		login.ClickonSigninbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		UpstoxPasscodePage passcode = new UpstoxPasscodePage(driver); // here we pass paramenter bcz we want open in chrome browser
		
		passcode.EnterPassCode();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		UpstoxWelComePage Clickgood = new UpstoxWelComePage(driver);
		
		Clickgood.clickonGood();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		UpstoxHomePage homepage = new UpstoxHomePage(driver);
		
		
		homepage.ValidateUserID(driver);
		
		homepage.ClickOnFund(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		UpstoxFundPage Fundsavl = new UpstoxFundPage(driver);
		
		Fundsavl.checkfunds();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		homepage.SwitchTologut(driver);
		
		driver.close();
		
		
		
		
		
		
		
				
				
		
		
		
		
		

	}

}
