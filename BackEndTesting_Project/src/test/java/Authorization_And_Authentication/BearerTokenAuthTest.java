package Authorization_And_Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenAuthTest {

	@Test
	public void bearerToken() {
		given()
		.auth().oauth2("token")//we dont have access for this 
		.log().all()

		.when()
		.get("http://49.249.28.218:8091/projects")

		.then()
		.log().all();
	}
}
