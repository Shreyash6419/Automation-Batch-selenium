package ExcelSheetPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet;

public class CommonExcelMethod {
	
	static File myFile;
	
	static Sheet mylocate;


	public static Object main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File myfile = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet mylocate = WorkbookFactory.create(myfile).getSheet("Sheet3");
		return mylocate;
	}	

	public static String readDataFromExcel(int row, int cell) 
	{
		
		String value = mylocate.getRow(row).getCell(cell).getStringCellValue();
		
		
		return null;
	}
	
	public static void waitTime(WebDriver driver,long waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
	}


}

