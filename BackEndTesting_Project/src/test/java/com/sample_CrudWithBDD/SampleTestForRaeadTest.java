package com.sample_CrudWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SampleTestForRaeadTest {

	
	@Test
	public void getDataFromServer() {
		given().get("http://49.249.28.218:8091/projects")
		.then().log().all()
		.assertThat().statusCode(200);
		
	}
}
