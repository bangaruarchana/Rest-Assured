package typesOfParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class formParameterTest {

	@Test
	public void formParam() {
		given()
		.formParam("teamSize", 0)
		//.queryParam("teamSize", 0)
		.log().all()

		.when()
		//	.get("http://49.249.28.218:8091/")
		.post("http://49.249.28.218:8091/")	
		.then()
		.log().all();
	}

}
