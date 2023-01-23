package UpStoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class UtilityNew {
	
	//excel input
	//screenshot
	//scrolling
	//wait
	
	// keep all method static as it will be better to call in any other class
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		
		return value;
		
		
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
