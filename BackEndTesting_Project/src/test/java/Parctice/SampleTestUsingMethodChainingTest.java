package Parctice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SampleTestUsingMethodChainingTest {
@Test
public void getRequestTest() {
	//RestAssured.get("https://reqres.in/api/users?page=2").prettyPrint();
	get("https://reqres.in/api/users?page=2").then().log().all();
	
	/*
	 * then() is present in RestAssured class after calling then() only we can access the log() and all()
       these two methods will get the response body as well
	 */
	
}
}
