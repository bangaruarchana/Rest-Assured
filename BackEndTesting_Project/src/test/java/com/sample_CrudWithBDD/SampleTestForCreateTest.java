package com.sample_CrudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTestForCreateTest {

	@Test
	public void postDataToServer() {
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "Uday Nagindla");
		jsonobj.put("status", "Created");
		jsonobj.put("teamsSize", 0);
		jsonobj.put("projectName", "Orange_12");
		
	    given()
		.contentType(ContentType.JSON)
		.body(jsonobj.toJSONString())
		
		.when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	}
}
