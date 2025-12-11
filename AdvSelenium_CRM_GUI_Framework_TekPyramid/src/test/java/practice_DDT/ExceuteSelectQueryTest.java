package practice_DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExceuteSelectQueryTest {

	public static void main(String[] args) throws Throwable {
		//step 1: load/register the database driver
	    Driver driverref= new Driver();
		DriverManager.registerDriver(driverref);//since driverManager and registerDriver are static methods
		
		//step 2: connect to database
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_name", "root", "root");
		System.out.println("-----------Executed----------");
		//step 3: create Sql statement
		
		Statement state=conn.createStatement();
		//step 4: execute select query get the result
		int result=state.executeUpdate("insert into sdet value ('1008','uday','8341992898','uday123@gmail.com','Hyderabad');");
		System.out.println(result);
		//step 5: close the connection
		conn.close();
		
	}
}
