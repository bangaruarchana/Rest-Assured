package practice_testng;

import org.testng.annotations.Test;

public class orderTest {

	@Test(invocationCount = 10)
	public void createOrderTest() {
		System.out.println("Executing createOrderTest===>123");
//		String s=null;
//		System.out.println(s.equals("123"));
	}
	
	@Test(enabled = false)//(dependsOnMethods = "createOrderTest")
	public void billingAnOrderTest() {
		System.out.println("Executing billingAnOrderTest===>123");
	}
}
