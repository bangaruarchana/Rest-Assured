package practicePostRequestTypes;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostReq_Via_JsonFile {

	@Test
	public void postDataToServerViaJsonFile() {
		File file=new File("./complexPostReq.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(file)
		
		
		.when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
