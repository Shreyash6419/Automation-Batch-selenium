package ScreenShotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotTest1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://paytm.com/");
		
		Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenpic\\paytmscreen.png");
		
		FileHandler.copy(src, destination);

	}
}
