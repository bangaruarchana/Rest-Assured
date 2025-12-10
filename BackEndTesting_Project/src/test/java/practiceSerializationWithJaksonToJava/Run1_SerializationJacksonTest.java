package practiceSerializationWithJaksonToJava;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder(
	value={"createdBy",
			"projectName",
			"teamSize",
			"status"
	}
)

@JsonIgnoreProperties(
		value= {
				"teamSize"
		},allowSetters = true
		)


class project{//POJO class (plain old java object)
	private String projectName;
	@JsonProperty(value="project Name")
	private String createdBy;
	private int teamSize;
	private String status;
	
	
	private project() {//for deserialization
		
	}
	public project(String projectName, String createdBy, int teamSize, String status ) {
		super();
		this.projectName=projectName;
		this.createdBy=createdBy;
		this.teamSize=teamSize;
		this.status=status;
	}


	public String getProjectName() {//generate getters & setters for the writing the data
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
}

public class Run1_SerializationJacksonTest {
	public static void main(String[] args) throws Throwable, DatabindException, IOException {
	project pObj=new project("PineApple", "Archana", 0, "Created");
	
	
	//serailization
	ObjectMapper objMap=new ObjectMapper();//import only from jackson not from RestAssured
	objMap.writeValue(new File("./project.json"), pObj);
	
	System.out.println("===========END============");
	
	
}
}
