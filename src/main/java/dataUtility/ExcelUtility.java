package dataUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	private FileInputStream fis;
	private Workbook book;
	
    public ExcelUtility() {
	 try {
		 fis = new FileInputStream("./src/test/resources/DataStorage/TestDataBook.xlsx");
		 book=WorkbookFactory.create(fis);
	 } catch(Exception e) {
	   e.printStackTrace();
   }
 

 }
     public  String getDataFromExcel(String SheetName,int rowNum,int cellNum) {
	 
	 Sheet sh = book.getSheet(SheetName);
	 
	 DataFormatter df= new DataFormatter();
	 
     String value =df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
	 return value;
 }


}
	


