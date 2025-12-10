package practiceSerializationWithJaksonToJava;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class Run2_DeserializationTest {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		ObjectMapper objMap=new ObjectMapper();
		project pObj = objMap.readValue(new File("./project.json"), project.class);
		
		System.out.println(pObj.getProjectName());
		System.out.println(pObj.getCreatedBy());
		System.out.println(pObj.getTeamSize());
		System.out.println(pObj.getStatus());
		
	}
}
