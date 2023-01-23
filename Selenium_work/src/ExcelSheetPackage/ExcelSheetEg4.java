package ExcelSheetPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File doc1 = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet sd1 = WorkbookFactory.create(doc1).getSheet("Sheet2");
		
		//String fy1 = sd1.getRow(0).getCell(0).getStringCellValue();
		
		int ss1 = sd1.getLastRowNum();// it returns last row count from 0 index
		
		System.out.println(ss1);
		
		int totalnumRow = ss1+1;
		
		System.out.println(totalnumRow);
		
		// check last cell number 
		
		int ss2 = sd1.getRow(0).getLastCellNum();
		
		System.out.println("lastcell in the row zero "+ss2); 
		
		int Totalnumcell = ss2-1;
		
		System.out.println("total number of cell "+Totalnumcell);
		System.out.println("==================================================");
		System.out.println();
		
		for(int i=0;i<=Totalnumcell;i++)
		{
			
			System.out.print(sd1.getRow(0).getCell(i).getStringCellValue()+" "); 
		}
		
		// Total no row = getlastrow + 1
		// Total no of column = getlastcell
		
		System.out.println("==================================================");
		System.out.println();
		// to get entire value present in sheet dynamically 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
