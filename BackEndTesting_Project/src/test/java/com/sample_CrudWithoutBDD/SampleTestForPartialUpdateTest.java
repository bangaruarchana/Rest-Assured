package com.sample_CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPartialUpdateTest {

	@Test
	public void patchDataToServer() {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "Archana Nagindla");

		RequestSpecification req=	RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		
		Response res=req.patch("http://49.249.28.218:8091/project/NH_PROJ_448");
		res.then().assertThat().statusCode(200);
		res.then().log().all();
	}
}
