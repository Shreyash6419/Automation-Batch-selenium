package ExcelSheetPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File doc1 = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet sd1 = WorkbookFactory.create(doc1).getSheet("Sheet2");
		
		//String fy1 = sd1.getRow(0).getCell(0).getStringCellValue();
		
		
		// how to read complete sheet in dynamic way
		
		int lastrow = sd1.getLastRowNum();
		
		int lastcell = sd1.getRow(lastrow).getLastCellNum()-1;
		
		for (int i=0;i<=lastrow;i++)
		{
			for(int j=0;j<=lastcell;j++)
			{
				System.out.print(sd1.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
			System.out.println("======================================");
		}

	}

}
