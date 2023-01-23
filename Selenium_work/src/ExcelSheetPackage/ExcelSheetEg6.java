package ExcelSheetPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File doc1 = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet sd1 = WorkbookFactory.create(doc1).getSheet("Sheet3");
		
		Cell mycell = sd1.getRow(0).getCell(0);
		
		CellType typecell = mycell.getCellType();
		
		if(typecell==CellType.STRING)
		{
			System.out.println(mycell.getStringCellValue()); 
		}
		
		else if (typecell==CellType.NUMERIC)
		{
			System.out.println(mycell.getNumericCellValue());
		}
		
		else if (typecell==CellType.BOOLEAN)
		{
			System.out.println(mycell.getBooleanCellValue());
		}
		
		else if(typecell==CellType.BLANK)
		{
			System.out.println("");
			
		}

	}

}
