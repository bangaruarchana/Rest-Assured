package com.sample_CrudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleTestForPartialUpdateTest {

	@Test
	public void patchDataToServer() {
		JSONObject obj=new JSONObject();
		obj.put("projectName", "Banana_23");
		
		given()
		.contentType(ContentType.JSON)
		.body(obj.toJSONString())
		
		.when()
		.patch("http://49.249.28.218:8091/project/NH_PROJ_013")
		
		.then()
		.log().all()
		.assertThat().statusCode(200);
	}
}
