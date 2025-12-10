package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	String testdataPath="./TestData/projectData.xlsx";

	/**
	 * read data from excel based on row and column index
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * @throws Throwable
	 */

	public String getDataFromExcel(String sheetName,int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(testdataPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		String data=sh.getRow(rowNum).getCell(cellNum).toString();
		wb.close();
		return data;

	}
	/**
	 * get the used row count based on sheetname
	 * @param sheetName
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * @throws 
	 */
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(testdataPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount=wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		return rowCount;

	}
	/**
	 * write data back to excel based on cell index
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param tRANSACTION_ID_VAR 
	 * @param data
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 *
	 */
	public void setDataIntoExcel(String sheetName,int rowNum,int cellNum, String tRANSACTION_ID_VAR) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream(testdataPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum);

		FileOutputStream fos=new FileOutputStream(testdataPath);
		wb.write(fos);
		wb.close();
	}






}
