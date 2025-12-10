package practicePostRequestTypes;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostReq_Via_JsonObject {

	@Test
	public void postDataToServer() {
		JSONObject jsonObj=new JSONObject();
		
		jsonObj.put("createdBy", "Deepak");
		jsonObj.put("status", "Created");
		jsonObj.put("teamSize", 0);
		jsonObj.put("projectName", "PineApple23");
		
	    given()
	    .contentType(ContentType.JSON)
	    .body(jsonObj.toJSONString())
	    
	    .when()
	    .post("http://49.249.28.218:8091/addProject")
	    
	    .then()
	    .assertThat().statusCode(201)
	    .log().all();
	}
}
