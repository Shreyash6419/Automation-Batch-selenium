package NeoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class NeoStoxutilityPropertyFile {
	
     public static String readDataFromPropertyFile(String key) throws IOException
     
     {
	
    	 // Create object of Properties class.
	
    	 Properties prop = new Properties();
	
    	 // create object of fileinputstream and pass properties file path 
	
    	 FileInputStream myfile = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium_work\\NeoStox.properties");
    	 
    	 prop.load(myfile);
    	 
    	 String value=prop.getProperty(key);
    	 
    	 return value ;
    	 
     }
	
     

     public static void screenshot(WebDriver Driver,String TCID) throws IOException
 	{
 		File scr = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
 		
 		File dest = new File("C:\\Users\\hp\\Desktop\\Screenshot\\screen1\\"+TCID+".jpg");
 		
 		FileHandler.copy(scr, dest);
 	}
 	
     public static void wait(WebDriver driver,int Waittime )
 	{
 		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Waittime));
 	}
     
     public static void scrollIntoview(WebDriver driver,WebElement element)
 	{
 		JavascriptExecutor js = (JavascriptExecutor)driver;
 		
 		js.executeScript("argument[0].scollIntoView()",element);
 		
 	}
	
}


 