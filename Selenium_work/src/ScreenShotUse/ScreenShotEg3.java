package ScreenShotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destin2 = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenpic\\Redbus.jpg");
		
		FileHandler.copy(src2, destin2);
		
		
	}

}
