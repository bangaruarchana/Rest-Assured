package practice_DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class CreateProject_AndVerifyData_InDB_With_GUI {

	@Test
	public void checking_GUI_withDB() throws Exception {
		String username="rmgyantra";
		String password="rmgy@9999";
		String projectName="E-Commerce";
		boolean flag=false;
		//Creating project in GUI using Selenium Code
//		ChromeOptions option= new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		WebDriver driver= new ChromeDriver(option);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://49.249.28.218:8091/");
		
		//login to the application (NINZA HRM)
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//		Alert alert= driver.switchTo().alert();
//	    alert.accept();
//		
		//creation of project in the application
	//	driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class=\"material-icons\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("projectName")).sendKeys(projectName);
		driver.findElement(By.name("createdBy")).sendKeys("Urvi");
		
		Select sel= new Select(driver.findElement(By.xpath("//option[text()='On Going']")));
		sel.selectByVisibleText("On Going");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		//Verifying data entered in frontend will reflect in DataBase
	    Driver driverref= new Driver();
	    DriverManager.registerDriver(driverref);
	    
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		
	    Statement stmt = con.createStatement();
	    ResultSet result = stmt.executeQuery("select * from projects;");
	    
	   // String pName = result.getString("project_Name");
	    
//	    if (result.next()) {
//	        String pName = result.getString("project_Name");
//	        String pCreatedBy = result.getString("created_by");
//	        System.out.println(pName);
//	        System.out.println(pCreatedBy);
//	    }
//	    
	    while(result.next()) {
        	String actual_empname = result.getString(2);
        	if(projectName.equals(actual_empname)) {
        		flag=true;
        		System.out.println(projectName + " is available====PASS");
        	}
        }
        if(flag==false) {
        	System.out.println(projectName + " is not available===FAIL");
        	Assert.fail();
	    con.close();
	    System.out.println("Disconnected");
		
	}
	
//	@Test
//	public void launchBrowser() {
//		new ChromeDriver();
//	}
}
}
