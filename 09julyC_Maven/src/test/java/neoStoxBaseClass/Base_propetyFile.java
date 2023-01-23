package neoStoxBaseClass;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neoStoxUtilityclass.NeoStoxutilityPropertyFile;



public class Base_propetyFile {
	
protected WebDriver driver =null;
	
	public void launchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(NeoStoxutilityPropertyFile.readDataFromPropertyFile("url"));
		
		NeoStoxutilityPropertyFile.wait(driver, 1000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}


}