package encryption;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class API_EncodeTest {

	@Test
	public void ApiEncode() {
		given()
		.auth().preemptive().basic("rmgyantra", "rmgy@999")
		.log().all()
		
		.when()
		.get("http://49.249.28.218:8091/projects")
		
		.then()
		.log().all();
		
	}
	
}
