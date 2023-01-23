package ScreenShotUse;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotTest3 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tatamotors.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destin1= new File("C:\\Users\\hp\\Desktop\\Screenshot\\tatahomepage.jpg");
	
	FileHandler.copy(src1, destin1);
		
		
		
		

	}

}
