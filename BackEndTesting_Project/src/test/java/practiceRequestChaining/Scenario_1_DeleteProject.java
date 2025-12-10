package practiceRequestChaining;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import pojoClassUtility.projectPojo;

public class Scenario_1_DeleteProject {

	@Test
	public void postDataToServer() {
		//create an object to pojo class
		Random random=new Random();
		int ranNum= random.nextInt();

		//API-1 ===>add a project inside the server
		projectPojo pojo=new projectPojo("Archana", "Airtel_"+ranNum, "Created",0 );
		Response res =given().contentType(ContentType.JSON)
				.body(pojo)
				.when()
				.post("http://49.249.28.218:8091/addProject");
		res.then()
		.assertThat().statusCode(201)
		.log().all();

		//capture project name from the response
		String projectId=res.jsonPath().get("projectId");
		System.out.println(projectId);
		
		//API-2 delete project
		given().delete("http://49.249.28.218:8091/project/"+projectId)
		
		.then().log().all();
	}
}
