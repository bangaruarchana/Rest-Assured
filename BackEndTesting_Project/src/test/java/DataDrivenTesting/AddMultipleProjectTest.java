package DataDrivenTesting;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class AddMultipleProjectTest {

	@Test(dataProvider = "getData")
	public void mulipleProject(String pName,String status) {
//		
//		String pName="Googleee";
//		String status="Created";
		String reqBody="{\r\n"
				+ "  \"createdBy\": \"Archana\",\r\n"
				+ "  \"projectName\": \""+pName+"\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}";
		given()
		.contentType(ContentType.JSON)
		.body(reqBody)

		.when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
		.log().all();
		
	}
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		ExcelUtility elib=new ExcelUtility();
		int count = elib.getRowCount("project");
		Object[][] objArray=new Object[count][2];
		
		for(int i=0;i<count;i++) {
			objArray[i][0]=elib.getDataFromExcel("project", i+1, 0);
			objArray[i][1]=elib.getDataFromExcel("project", i+1, 1);	
		}
		
		return objArray;
	}
	
	}

