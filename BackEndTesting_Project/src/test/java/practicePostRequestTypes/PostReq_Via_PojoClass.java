package practicePostRequestTypes;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

import pojoClassUtility.projectPojo;

public class PostReq_Via_PojoClass {

	@Test
	public void postDataToServerViaPojoClass() {
		
		Random random=new Random();
		int ranNum=random.nextInt(5000);
		//create an object to pojo class
		projectPojo pojo=new projectPojo("Aravind", "Maple"+ranNum, "Created", 0);
		
		given()
		.contentType(ContentType.JSON)
		.body(pojo)

		.when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	}
}
