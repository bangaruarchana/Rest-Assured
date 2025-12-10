package practiceRequestChaining;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojoClassUtility.EmployeePojo;
import pojoClassUtility.projectPojo;

import static io.restassured.RestAssured.*;

public class Scenario_2_AddEmployeeToProject {

	@Test
	public void addEmpToProject() {
		Random random=new Random();
		int ranNum = random.nextInt();

		//API-1 create a project
		projectPojo pojo=new projectPojo("Archana", "Mango"+ranNum, "Created", 0);

		Response res = given()
				.contentType(ContentType.JSON)
				.body(pojo)

				.when().post("http://49.249.28.218:8091/addProject");

		res.then().assertThat().statusCode(201);
		res.then().log().all();
		//capture project Id from the response
		String projectName=res.jsonPath().get("projectName");
		System.out.println(projectName);

		//API-2 Add an Employee to same project
		//String designation,String dob,String email,String empName,double experience, 
		//String mobileNo,String project,String role,String username
		EmployeePojo empPojo=new EmployeePojo("QA", "23/12/1993", "bangaruarchana@gmail.com", 
				"user_"+ranNum, 4, "9502516879", projectName, "ROLE_EMPLOYEE", "user_"+ranNum);
		given()
		.contentType(ContentType.JSON)
		.body(empPojo)

		.when()
		.post("http://49.249.28.218:8091/employees")

		.then().assertThat().statusCode(201)
		.log().all();




	}
}
