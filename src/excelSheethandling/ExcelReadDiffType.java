package excelSheethandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadDiffType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// to read excel sheet we need to create object of file class and give path of exccel
		
		File myfile= new File("D:\\Selenium\\test2.xlsx");
		
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet2");
		
		Row myrow = mysheet.getRow(0);
		Cell mycell = myrow.getCell(0);
		System.out.println(mycell.getCellType());
		
		//code to read data from excel sheet 
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=1; j++)
			{
				String value = book.getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +"  ");
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
