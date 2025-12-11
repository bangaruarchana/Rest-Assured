package practice_DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class try_CatchBlock_inRealUsageWithDataBase {

	public static void main(String[] args) throws Throwable {
		Connection conn=null;
		try{//step 1: load/register the database driver
		Driver driverref= new Driver();
		DriverManager.registerDriver(driverref);
		
		//step 2: connect to tye database
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_name", "root","root");
		System.out.println("=====Connected to database=====");
		
		//step 3: create sql statement
		Statement state = conn.createStatement();
		
		//step 4: execute select query and get the result
	ResultSet result = state.executeQuery("select * from sdet");
	while(result.next()) {
		System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
	}
	}catch (Exception e) {
		System.out.println("handle exception");
	}
		finally {
			//step 5: close the connnection
			conn.close();
			System.out.println("closed the connection");
		}
}
}
