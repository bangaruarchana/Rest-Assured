package practicePostRequestTypes;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostReq_Via_HashMap {

	@Test
	public void postDataToServer() {
		HashMap<String,Object> map=new HashMap<String, Object>();
		map.put("createdBy", "Deepak");
		map.put("projectName", "PineApple123");
		map.put("teamSize", 0);
		map.put("status", "Created");
		
	given()
	.contentType(ContentType.JSON)
	.body(map)

	.when()
    .post("http://49.249.28.218:8091/addProject")
    
    .then()
    .assertThat().statusCode(201)
    .log().all();
	}
}
