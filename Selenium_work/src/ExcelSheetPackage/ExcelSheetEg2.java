package ExcelSheetPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelSheetEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File myFile1 = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		//FileInputStream Locate1 = new FileInputStream(myFile1);
		
		Workbook xx1 = WorkbookFactory.create(myFile1);
		org.apache.poi.ss.usermodel.Sheet mysheet=xx1.getSheet("Sheet1");
		
		Row myrow = mysheet.getRow(0);
		org.apache.poi.ss.usermodel.Cell mycell = myrow.getCell(0);
		
		org.apache.poi.ss.usermodel.CellType typecell = mycell.getCellType();
				
		System.out.println(typecell);
		
		System.out.println(mycell);
				
				
				
				
				
				
		
		
		
		
		

	}

}
