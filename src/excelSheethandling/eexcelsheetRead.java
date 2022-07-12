package excelSheethandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eexcelsheetRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// create excel sheet 
		// create file object and give path and name as paramier
		File myfile= new File("D:\\Selenium\\test1.xlsx");
		
		String name1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(name1);
		
		String name2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(name2);
		double number1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();

		System.out.println(number1);
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(11).getCell(7).getStringCellValue();
		System.out.println(value);
		
		
	}

}
