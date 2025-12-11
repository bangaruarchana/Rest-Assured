package practiceTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

public class InvoiceTest extends BaseClass{

	@Test
	public void createInvoiceTest() {
		Reporter.log("Execute createInvoiceTest",true);
	}
	
	@Test
	public void createInvoiceWithContactTest() {
		Reporter.log("Execute createInvoiceWithContactTest",true);

	}
}
