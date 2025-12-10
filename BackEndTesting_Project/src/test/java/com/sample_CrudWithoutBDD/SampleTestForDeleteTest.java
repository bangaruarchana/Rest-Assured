package com.sample_CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForDeleteTest {

	@Test
	public void deleteDataInServer() {
		
		Response res=RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_448");
		res.then().log().all();
		res.then().assertThat().statusCode(204);
	}
	
	@Test
	public void deleteDataInServer2() {
		Response res=RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_473");
       res.then().log().all();
       res.then().assertThat().statusCode(204);
		
	
		
		
	}
}
