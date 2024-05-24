package section3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import dataUtility.Workbook;

public class DemoExcel {
	public static void main(String[] args)throws EncryptedDocumentException, IOException {
       
		FileInputStream fis = new FileInputStream(" ");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");
		
		DataFormatter df = new DataFormatter();
		String value1 = df.formatCellValue(sh.getRow(1).getCell(1));
		System.out.println(value1);
		
		String value2 = df.formatCellValue(sh.getRow(3).getCell(2));
		System.out.println(value2);
		
		book.close();
	}

}
