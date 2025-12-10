package com.sample_CrudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleTestForCompleteUpdateTest {

	@Test
	public void putDataToServer() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "Archana Nagindla");
		obj.put("status", "Created");
		obj.put("teamSize", 10);
		obj.put("projectName", "PineApple_40");
		
		given()
		.contentType(ContentType.JSON)
		.body(obj.toJSONString())
		
		.when()
		.put("http://49.249.28.218:8091/project/NH_PROJ_013")

		.then()
		.log().all()
		.assertThat().statusCode(200);
	
	}
}
