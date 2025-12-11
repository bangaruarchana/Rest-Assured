package practice_testng;

import org.testng.annotations.Test;

public class createcontactTest {

	@Test 
	public void createContactTest() {
		System.out.println("Exceuting createContactTest with===HDFC");
	}
	
	@Test (dependsOnMethods = "createContactTest")
	public void modifyContactTest() {
		//System.out.println("create contact ICICI");
		//System.out.println("exceute query insert contact in DB===>ICICI");//instead of creating con multile time better to insert into DB this is another approach
		System.out.println("Exceuting modifyContactTest===ICICI-->ICICI_1");
	}
	
	@Test(dependsOnMethods = "modifyContactTest")//instead of priority we can create contact 
	public void deleteContactTest() {//should not use the priorty because the depencence case fails ever tc fails 
		//System.out.println("create UPI contact");
		System.out.println("Exceuting deleteContactTest===UPI");
	}
}
