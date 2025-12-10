package Authorization_And_Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class basicAuthTest {

	@Test
	public void basicAuth() {
		given()
		.log().all()
      .auth().basic("rmgyantra", "rmgy@9999")
		.when()
    .get("http://49.249.29.5:8091/login")
		.then()
		.log().all();
	}

}
