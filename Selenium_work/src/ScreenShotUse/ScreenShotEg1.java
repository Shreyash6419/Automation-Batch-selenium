package ScreenShotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File screen1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File locate = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenpic\\flipkart.png");
		
		FileHandler.copy(screen1, locate);
		

	}

}
