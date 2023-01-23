package UpstoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTestclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet mylocate = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		String un = mylocate.getRow(2).getCell(0).getStringCellValue();
		
		String ps = mylocate.getRow(2).getCell(1).getStringCellValue();
		
		String pass = mylocate.getRow(2).getCell(2).getStringCellValue();
		
		String ExId = mylocate.getRow(2).getCell(3).getStringCellValue();
		
		//create an object of login page 
		
		UpstoxLoginpageExcel login = new UpstoxLoginpageExcel(driver);
		
		login.enteruserID(un);
		
		login.enterpassword(ps);
		
		login.ClickonSigninbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//create an object of Passcode Page
		
		UpstoxPasscodeExcel passcode = new UpstoxPasscodeExcel(driver);
		
		passcode.EnterPassCode(pass);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//create an object of Welcome page 
		
		UpstoxWelComePage Iamgood = new UpstoxWelComePage(driver);
		
		Iamgood.clickonGood();
		
		//create an object of Home page 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		UpstoxHomePageExcel homepage = new UpstoxHomePageExcel(driver);
		
		homepage.ValidateUserID(driver, ExId);
		
		homepage.ClickOnFund(driver);
		
		//create an object of Fund page 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		UpstoxFundPageExcel fundcheck = new UpstoxFundPageExcel(driver);
		
		fundcheck.checkfunds();
		
		
		homepage.SwitchTologut(driver);
		
		driver.close();
		
		
		

	}

}
