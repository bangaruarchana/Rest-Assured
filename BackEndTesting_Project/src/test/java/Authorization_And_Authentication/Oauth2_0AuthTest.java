package Authorization_And_Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0AuthTest {//we cannot run this API we don't have access for this

	@Test
	public void oauth2_0(){
		
		Response res=given()
		.formParam("client_id", "ninza-client")
		.formParam("client_secret", "gkjZHJCGjbzcugsycjhZB")
		.formParam("grant_type", "client_credentials")
		
		.when()
		.post("http://49.249.28.218:8080/auth/realms/ninza/protocol/openid-connect/token");
		
		res.then()
		.log().all();
		
		//capture token frm the response[keyClock (Oauth2.0)]
		String token=res.jsonPath().get("access_token");
		given()
		.auth().oauth2(token)
		
		.when()
		.get("http://49.249.28.218:8091/projects")
		
		.then()
		.log().all();
		
	}
}
