package practiceResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class VerifyDataComplex_JsonXpath {

	@Test
	public void responseBodyValidationWithJsonXpath() {
		Response res = given().get("http://49.249.28.218:8091/projects-paginated");
		res.then().log().all();
		
	List<String> list=	JsonPath.read(res.asString(),".content[*].projectName");
	
	for(String projectName:list) {
		System.out.println(projectName);
	}
	
  List<String>lst=  JsonPath.read(res.asString(),".content[*].[?(@.projectName=='Project1')].projectId");
    String actualprojectId=lst.get(0);
    System.out.println(actualprojectId);
    
    Assert.assertEquals(actualprojectId, "NH_PROJ_001");
    //    for(String  data:lst) {
//    	System.out.println(data);	
//    }
  
   
	}
}
