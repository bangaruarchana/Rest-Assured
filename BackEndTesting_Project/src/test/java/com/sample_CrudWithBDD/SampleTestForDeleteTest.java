package com.sample_CrudWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SampleTestForDeleteTest {

	@Test
	public void deleteDataFromServer() {
    given()
	.delete("http://49.249.28.218:8091/project/NH_PROJ_012")
	
	.then()
	.log().all()
	.assertThat().statusCode(204);
	
	}
}
