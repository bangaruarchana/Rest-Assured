package practice_testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class createContact_UsingDataProviderTest {

	@Test(dataProvider = "getData")
	public void createContactTest(String firstname,String lastName) {
		System.out.println("FirstName : "+firstname +" LastName :" +lastName);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[4][2];
		data[0][0]="archana";
		data[0][1]="nagindla";
		data[1][0]="uday";
		data[1][1]="nagindla";
		data[2][0]="chashu";
		data[2][1]="nagindla";
		data[3][0]="urvi";
		data[3][1]="nagindla";
		
		return data;
	}
}
