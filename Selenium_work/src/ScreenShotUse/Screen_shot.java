package ScreenShotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    File path=new File("C:\\Users\\hp\\OneDrive\\Desktop\\Selenium from 16.09 to 23.09\\SCR1.jpeg");
	    
	    FileHandler.copy(scr1, path);
		
		
		
		

	}

}
