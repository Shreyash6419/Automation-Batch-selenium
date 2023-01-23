package ExcelSheetPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File doc1 = new File("H:\\selenium\\9julyCexcel.xlsx");
		
		Sheet sd1 = WorkbookFactory.create(doc1).getSheet("Sheet1");
		
		String fy1 = sd1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(fy1);
		
		for(int i=0;i<=3;i++)
		{
			String fy2 = sd1.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(fy2);
		
		}
		System.out.println();
		System.out.println("==============================");
		
		for(int j=0;j<=3;j++)
		{
			String fy3 = sd1.getRow(j).getCell(0).getStringCellValue();
			
			System.out.print(fy3+" ");
		}
		System.out.println();
		System.out.println("=======================================");
		System.out.println("===================all row and cell out put ====================");
		
		System.out.println("====================reading whole data from excel===================");
		
		//outer loop for reading rows == varing from 0 to 1
		for(int i=0;i<=1;i++)
		{
			//inner for loop for reading column == varing from 0 to 3 
			for(int j=0;j<=3;j++)
			{
				
				String fy4 = sd1.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(fy4+" ");
			}
			System.out.println();
			System.out.println("=======================================");
			
		}

	}

}
