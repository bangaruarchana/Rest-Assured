package practiceResponseValidation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class VerifyResponseHeaderTest {

	@Test
	public void verifyHeader() {
		
		//capture the response for the validation
		Response res=given()
		.get("http://49.249.28.218:8091/projects");
		
		res.then().log().all();
		
		res.then().assertThat().statusCode(200);
		res.then().assertThat().statusLine("HTTP/1.1 200 ");
		res.then().assertThat().contentType(ContentType.JSON);
		//verifying the key with the value 
		res.then().assertThat().header("Pragma", "no-cache");
		
		
		
	}
}
