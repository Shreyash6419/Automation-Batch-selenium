package ScreenShotUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotGeneralize {
	
	
	public static void screnShotmethod(WebDriver driver,String name) throws IOException
	{
		File Sc1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File locate = new File("C:\\Users\\hp\\Desktop\\Screenshot\\"+name+".jpg");
		
		FileHandler.copy(Sc1, locate);
	}

}
