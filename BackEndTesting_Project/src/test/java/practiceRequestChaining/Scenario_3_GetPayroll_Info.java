package practiceRequestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Scenario_3_GetPayroll_Info {

	@Test
	public void payrollInfo() {

		//API-1 get Authentication 
		Response res=		given()
				.formParam("client_id", "ninza-client")
				.formParam("client_secret", "gPQBf1Yxew50MccMhzos1GefIyiSnXzM")
				.formParam("grant_type", "client_credentials")

				.when().post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");

		res.then().log().all();

		//capture the token from the response
		String token=res.jsonPath().get("access_token");

		//API-2 get payroll info
		given()
		.auth().oauth2(token)
		.get("http://49.249.28.218:8091/admin/payrolls")

		.then().log().all();
	}
}
