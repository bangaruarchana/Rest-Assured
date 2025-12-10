package typesOfParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class paramParameterTest {

	@Test
	public void paramParameter() {
		given()
		.param("teamSize", 0)
		.log().all()

		.when()
		//.post("http://49.249.28.218:8091/")
         .get("http://49.249.28.218:8091/")
		
		.then()
		.log().all();
	}
}
