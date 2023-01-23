package ExcelSheetPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File docname = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet doc1 = WorkbookFactory.create(docname).getSheet("sheet1");
		
		Cell doc2 = doc1.getRow(0).getCell(8);
		
		CellType celltype = doc2.getCellType();
		
		if(celltype==CellType.STRING)
			
		{
			System.out.println(doc2.getStringCellValue());
		}
		
		else if(celltype==CellType.NUMERIC)
			
		{
			System.out.println(doc2.getNumericCellValue());
		}
		
		else if(celltype==CellType.BOOLEAN)
			
		{
			System.out.println(doc2.getBooleanCellValue());
		}
		else if(celltype==CellType.BLANK)
			
		{
			System.out.println("no value present in cell ");
		}
		
		

	}

}
