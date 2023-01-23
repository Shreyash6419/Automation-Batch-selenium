package ScreenShotUse;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_timestamp {
		

			public static void main(String[] args) throws IOException {
				
				System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				Date tarik = new Date();
				System.out.println(tarik);
				
				
				//String x = tarik.toString();				
				String x =tarik.toString().replace(" ", "_").replace(":", "-");			
				//System.out.println(x);
			    File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    
			    File path=new File("C:\\Users\\hp\\OneDrive\\Desktop\\Screenshot\\"+x+".jpeg");
			    
			    FileHandler.copy(scr1, path);
			    
			    
			    

	}

}
