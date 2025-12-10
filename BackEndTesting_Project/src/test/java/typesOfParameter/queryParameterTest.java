package typesOfParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class queryParameterTest {

	@Test
	public void queryParam() {
		given()
		.queryParam("teamSize", 0)
		.when()
	//	.get("http://49.249.28.218:8091/project?projectId=NH_PROJ_043")
	//	.get("http://49.249.28.218:8091/project?teamSize=10")
		.get("http://49.249.28.218:8091/project")
		
		.then()
		.log().all();
	}
}
