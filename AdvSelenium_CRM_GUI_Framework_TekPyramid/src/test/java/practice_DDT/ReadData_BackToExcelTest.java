package practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_BackToExcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\TestScriptdata.xlsx");
	    Workbook wb= WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("org");
	    Row row = sheet.getRow(7);
	   Cell cell = row.createCell(4);
	   
	   cell.setCellType(CellType.STRING);
	   cell.setCellValue("PASS");
	   
	   FileOutputStream fos= new FileOutputStream("C:\\Users\\Administrator\\Desktop\\TestScriptdata.xlsx");
	   wb.write(fos);
	   wb.close();
	   System.out.println("------------Executed-------------");
	}
}
