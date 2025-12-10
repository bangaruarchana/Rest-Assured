package com.sample_CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestForReadTest {
@Test
public void getDataFromServer() {
	Response res=RestAssured.get("http://49.249.28.218:8091/projects");
	
	//System.out.println(res.prettyPrint());//this prettyprint() will give the response in the form of json
	//System.out.println(res.asString());//this asSting() will give the response in the form of String
	
	res.then().assertThat().statusCode(200);
	res.then().log().all();
}
}
