package ScreenShotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg4 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.deriver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File store = new File("C:\\Users\\hp\\Desktop\\Screenshot\\screen1.jpg");
		
		FileHandler.copy(scr1, store);

	}

}
