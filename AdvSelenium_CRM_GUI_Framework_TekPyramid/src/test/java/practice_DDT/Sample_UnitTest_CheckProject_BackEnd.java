package practice_DDT;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sample_UnitTest_CheckProject_BackEnd {

	@Test
	public void projectCheckTest() throws Throwable {
		String expectedempname="chashu";
		boolean flag=false;
		//step 1:load/register the database
		Driver driverref=new Driver();
        DriverManager.registerDriver(driverref);	
        
        //step 2:connect to database
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_name", "root","root");
        System.out.println("Connected to database");
        
        //step 3: create Sql Statement 
        Statement state=conn.createStatement();
        
        //step 4: execute the select query and get the result
        ResultSet result=state.executeQuery("select * from sdet");
        while(result.next()) {
        	String actual_empname = result.getString(2);
        	if(expectedempname.equals(actual_empname)) {
        		flag=true;
        		System.out.println(expectedempname + " is available====PASS");
        	}
        }
        if(flag==false) {
        	System.out.println(expectedempname + " is not available===FAIL");
        	Assert.fail();
        }
        //step 5:close the connection
        conn.close();
        
       
		}
	
}
