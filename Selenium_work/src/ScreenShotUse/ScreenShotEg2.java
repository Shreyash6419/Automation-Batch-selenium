package ScreenShotUse;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		Date X1 = new Date();
		
		String X2 = X1.toString();
		
		//String x =tarik.toString().replace(" ", "_").replace(":", "-");			
		System.out.println(X2);
		
		//File Src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File Destin1 = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenpic\\amazon.png");
		
		//FileHandler.copy(Src1, Destin1);
		

	}

}
