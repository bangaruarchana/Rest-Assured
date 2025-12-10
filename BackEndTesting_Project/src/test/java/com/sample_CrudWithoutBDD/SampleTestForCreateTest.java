package com.sample_CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCreateTest {

	@Test
	public void createDataInServer() {

		JSONObject jsonobj=new JSONObject();

		jsonobj.put("createdBy", "Archana");
		jsonobj.put("status", "Created");
		jsonobj.put("teamSize", 0);//teamsize must be zero only while Created
		jsonobj.put("projectName", "Avacado");

		RequestSpecification req=RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());

		Response res=req.post("http://49.249.28.218:8091/addProject");
		res.then().log().all();
		res.then().assertThat().statusCode(201);
	}
}
