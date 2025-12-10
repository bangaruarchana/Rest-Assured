package Authorization_And_Authentication;

import org.testng.Reporter;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class prememitiveAuthTest {

	@Test
	public void prememitiveAuth() {
		given()
		.log().all()
		.auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.when()
		.get("http://49.249.29.5:8091/login")
		.then()
		.log().all();
		Reporter.log("Logged in");
	}

}
