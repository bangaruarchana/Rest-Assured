package practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practiceReading_MultipleDataFromExcel {
 
	public static void main(String[] args) throws Throwable {
		String expectedTestId="tc_01";
		String data1="";
		String data2="";
		String data3="";
		FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\Desktop\\TestScriptdata.xlsx");
	    Workbook wb= WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("org");
	    
	   String row = sheet.getRow(0).getCell(0).toString();
	 int row_count = sheet.getLastRowNum();
	 for(int i=0;i<=row_count;i++) {
		 String data = sheet.getRow(0).getCell(0).toString();
		 if(data==expectedTestId) {
			 data1=sheet.getRow(i).getCell(1).toString();
			 data2=sheet.getRow(i).getCell(2).toString();
			 data3=sheet.getRow(i).getCell(3).toString();
		 }
		 System.out.println(data1);
		 System.out.println(data2);
		 System.out.println(data3);
	 }
	
	}
}
