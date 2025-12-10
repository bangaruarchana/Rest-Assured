package Parctice;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

	class project123 {
		String projectName;
		String projectstatus;
		int teamSize;
		List<String> teamMember;
		ProjectManager projectManager;
		

		public project123(String projectName, String projectstatus, int teamSize, List<String> teamMember,
				ProjectManager projectManager) {
			super();
			this.projectName = projectName;
			this.projectstatus = projectstatus;
			this.teamSize = teamSize;
			this.teamMember = teamMember;
			this.projectManager = projectManager;
		}
		public void setPorjectName(String porjectName) {
			this.projectName = porjectName;
		}
		public String getPorjectName() {
			return projectName;
		}

		public void setProjectstatus(String projectstatus) {
			this.projectstatus = projectstatus;
		}
		public String getProjectstatus() {
			return projectstatus;
		}

		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}
		public int getTeamSize() {
			return teamSize;
		}

		public void setTeamMember(List<String> teamMember) {
			this.teamMember = teamMember;
		}
		public List<String> getTeamMember() {
			return teamMember;
		}

		public void setProjectManager(ProjectManager projectManager) {
			this.projectManager = projectManager;
		}
		public ProjectManager getProjectManager() {
			return projectManager;
		}
	}
	class ProjectManager {
		public ProjectManager(String name, String id) {
			super();
			this.name = name;
			this.id = id;
		}
		String name;
		String id;
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}

		public void setId(String id) {
			this.id = id;
		}
		public String getId() {
			return id;
		}
	}
		public class Run_POJO {
	public static void main(String[] args) throws Throwable, DatabindException, IOException {
    List<String> lst=new ArrayList<String>(); 
    lst.add("John");
    lst.add("david");
    lst.add("stev");
    
    ProjectManager pm=new ProjectManager("sagar","tp01");
    
    project123 pobj=new project123("Deepak", "created", 0, lst, pm);
    
   // System.out.println(pobj.projectName);
    
    //converting back to json file
    
    ObjectMapper objMap=new ObjectMapper();
    objMap.writeValue(new File("./project123.json"), pobj);
    
    System.out.println("=========END=============");
	}
}
	
