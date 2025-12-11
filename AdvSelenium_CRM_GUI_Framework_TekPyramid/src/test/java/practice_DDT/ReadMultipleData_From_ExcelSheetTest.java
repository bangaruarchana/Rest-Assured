package practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData_From_ExcelSheetTest {
 
	public static void main(String[] args) throws IOException {	
				FileInputStream fis =new FileInputStream("C:\\Users\\Administrator\\Desktop\\TestScriptdata.xlsx");
				 
				Workbook wb=WorkbookFactory.create(fis);
			
				Sheet sheet=wb.getSheet("Sheet1");
			
	          int rowCount=sheet.getLastRowNum();
			for(int i=1;i<=rowCount;i++) {
				Row row=sheet.getRow(i);
				
			String Column1_data=row.getCell(0).toString();
			String Column2_data=row.getCell(1).toString();
			
			
//			System.out.println(Column1_data);
//			System.out.println(Column2_data);
			System.out.println(Column1_data +"\t"+Column2_data );
			}
			
			wb.close();
	}
}
