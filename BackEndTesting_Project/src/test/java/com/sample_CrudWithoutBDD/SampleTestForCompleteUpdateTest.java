package com.sample_CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCompleteUpdateTest {
@Test
public void updateDataInServer() {
	
	JSONObject jsonobj=new JSONObject();
	jsonobj.put("createdBy", "Archana");
	jsonobj.put("status", "Created");
	jsonobj.put("teamsize", 0);
	jsonobj.put("projectName", "Avacado_021");

	RequestSpecification req=RestAssured.given();
	req.contentType(ContentType.JSON);
	req.body(jsonobj.toJSONString());
	
	Response res=req.put("http://49.249.28.218:8091/project/NH_PROJ_448");//put is used to update complete data 
	res.then().log().all();
	res.then().assertThat().statusCode(200);
	
}
}
