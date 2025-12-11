package practice_testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class createContact_UsingDataProviderTest2 {

	@Test(dataProvider = "getData")
	public void createContactTest(String firstname,String lastName,long phoneNumber) {
		System.out.println("FirstName : "+firstname +" LastName :" +lastName + "PhoneNumber:" +phoneNumber);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[4][3];
		data[0][0]="archana";
		data[0][1]="nagindla";
		data[0][2]=9502516373l;
		
		data[1][0]="uday";
		data[1][1]="nagindla";
		data[1][2]=8341992892l;
		
		data[2][0]="chashu";
		data[2][1]="nagindla";
		data[2][2]=9502517512l;
		
		data[3][0]="urvi";
		data[3][1]="nagindla";
		data[3][2]=8234785125l;
		
		return data;
	}
}
