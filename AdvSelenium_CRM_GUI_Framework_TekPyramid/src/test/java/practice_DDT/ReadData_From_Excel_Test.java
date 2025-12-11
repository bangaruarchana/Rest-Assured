package practice_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_From_Excel_Test {
 
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1: get the Excel path location & java object of the physical ExcelFile
		
		FileInputStream fis =new FileInputStream("C:\\Users\\Administrator\\Desktop\\TestScriptdata.xlsx");
		
		//step 2: open Workbook in the Read mode
		Workbook wb=WorkbookFactory.create(fis);
		
		//step 3: get the control of the "org" sheet
		Sheet sheet=wb.getSheet("Org");
		
		//step 4: get the control of the "1st" Row
		Row row=sheet.getRow(1);
		
		//step 5: get the control of the 2nd cell & read the String data
		
		Cell cell=row.getCell(1);
		//String data=cell.getStringCellValue();
		   String data=row.getCell(3).toString();
		System.out.println(data);
		
		
		
		//step 6: close the Workbook
		wb.close();
	}
}
