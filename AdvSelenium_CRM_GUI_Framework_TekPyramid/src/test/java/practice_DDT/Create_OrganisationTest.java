package practice_DDT;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Create_OrganisationTest {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\OrgCommonData.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String Browser = prop.getProperty("browser");
		String Url = prop.getProperty("url");
		String Username = prop.getProperty("username");
		String Password = prop.getProperty("password"); 
		
		try (Scanner sc = new Scanner(System.in)) { 
			System.out.println("Enter the browser");
			String browser=sc.next();
			
			WebDriver driver=null;
			
			if(browser.equals("firefox")) {
				driver =new FirefoxDriver();
			}
			else if (browser.equals("chrome")) {
				driver =new ChromeDriver();
			}
			else if (browser.equals("edge")) {
				driver = new EdgeDriver();
			}


			//driver =new FirefoxDriver(); 
			//driver.get(prop.getProperty("url"));
			driver.get(Url);
			driver.findElement(By.name("user_name")).sendKeys(Username);
			driver.findElement(By.name("user_password")).sendKeys(Password);
			driver.findElement(By.id("submitButton")).click();

			driver.findElement(By.linkText("Organizations")).click();
			driver.quit();
		}



	}
}
