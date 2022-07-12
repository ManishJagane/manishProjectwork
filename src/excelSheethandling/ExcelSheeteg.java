package excelSheethandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheeteg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// to get and read diffrent type  of value in a sheet
		
		File myfile= new File("D:\\Selenium\\test2.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int totalnorow = mysheet.getLastRowNum();
		
		int rowcount = totalnorow;
		
		System.out.println("Total no. of row is "+ rowcount);
		
		short totalcellno = mysheet.getRow(rowcount).getLastCellNum();
		int cellcount = totalcellno-1;
		System.out.println("total cell no. is "+ cellcount);
		
		
		// use loop for get all value 
		
		for(int i= 0; i<=rowcount; i++)
		{
			for(int j=0; j<=cellcount; j++)
			{
				Cell cellvalue = mysheet.getRow(i).getCell(j);
				CellType type = cellvalue.getCellType();
				
				if(type==CellType.STRING)
				{
					String value = cellvalue.getStringCellValue();
					System.out.print(value+"  ");
					
				}
				else if(type==CellType.NUMERIC)
				{
					double value = cellvalue.getNumericCellValue();
					System.out.print(value+"  ");
					
				}
				else if(type==CellType.BOOLEAN)
				{
					boolean value = cellvalue.getBooleanCellValue();
					System.out.print(value+"  ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.print(" ");
			
				}
				
			}
			System.out.println();
		}
		
		

	}

}
