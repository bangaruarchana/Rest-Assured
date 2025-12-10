package encryption;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class updatePayroll_InfoVia_AES_Encryption {//we cannot work on this since we dont have access on the payroll

	@Test
	public void updatePayroll() throws Exception {
		//{ "employee": { "empId":"NH_00013", "mobileNo": "9502153673", "dob": null, "role": "string", "email": “demo@gmail.com” }, "basicPlusVda": 0, "hra": 2000, "insurance": 2000, "lta": 0, "lwf": 0, "netPay": 0, "payroll_id": 0, "pf": 0, "pt": 0, "stat_bonus": 0, "status": “Active/Disabled” }

		EncryptAndDecryptUtility ed=new EncryptAndDecryptUtility();
		String jbody="{ \"employee\": { \"empId\":\"NH_00013\", \"mobileNo\": \"9502153673\", \"dob\": null, \"role\": \"string\", \"email\": “demo@gmail.com” }, \"basicPlusVda\": 0, \"hra\": 2000, \"insurance\": 2000, \"lta\": 0, \"lwf\": 0, \"netPay\": 0, \"payroll_id\": 0, \"pf\": 0, \"pt\": 0, \"stat_bonus\": 0, \"status\": “Active/Disabled” }";

		String jreqbody=ed.encrypt(jbody, "Ac03tEam@j!tu_#1");
		Response res=given()
				.body(jreqbody)
				.when()
				.put("http://49.249.28.218:8091/payroll");
		res.then()
		.log().all();
		
		String resBody=ed.decrypt(res.getBody().asString(), "Ac03tEam@j!tu_#1");
		System.out.println(resBody);
	}
}
