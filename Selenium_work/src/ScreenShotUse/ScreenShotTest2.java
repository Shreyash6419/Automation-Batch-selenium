package ScreenShotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotTest2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//File Doc1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File Destination1 = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenpic\\testshot.png");
		
		//FileHandler.copy(Doc1, Destination1);
		
		ScreenShotGeneralize.screnShotmethod(driver,"google");

	}

}
