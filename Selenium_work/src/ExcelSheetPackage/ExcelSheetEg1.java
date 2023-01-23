package ExcelSheetPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// create excel sheet and store it in File type object 
		File myFile = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		//Cretate an object of Fileinputstream and pass file object in that 
		FileInputStream myexel = new FileInputStream(myFile);
		
	    String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    
	    System.out.println(value);
	    
	    double value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(4).getCell(0).getNumericCellValue();
	    
	    System.out.println(value1);
	    
	    
	    String value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
	    System.out.println(value2);
	    
	    double value4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(4).getCell(2).getNumericCellValue();
	    
	    System.out.println(value4);
	    
	    String value5 = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
	    
	    System.out.println(value5);
	    
	    boolean value6 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(5).getCell(1).getBooleanCellValue();
	    System.out.println(value6);
//	    
//	    boolean value5 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(4).getCell(1).getBooleanCellValue();
//	    
//	    System.out.println(value5);
	}

}
