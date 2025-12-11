package practice_DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Create_Org1 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\Desktop\\commondata.properties");
		Properties prop= new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String oraganisation_name=prop.getProperty("organaisation");
		String phone=prop.getProperty("phone");
		
		
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver= new ChromeDriver(); 
		}
		else if (browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		else if (browser.equals("edge")) {
			driver= new EdgeDriver();
		}
		else {
			driver= new ChromeDriver();
		}
		Actions action=new Actions(driver);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.name("accountname")).sendKeys(oraganisation_name);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.id("phone")).sendKeys(phone);
		driver.findElement(By.name("button")).click();
		
		WebElement verification=driver.findElement(By.linkText("Organizations"));
		verification.isDisplayed();
		WebElement signout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		action.moveToElement(signout).click().perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
		driver.close();
		
		
		
		
		
		
		
	}
	
	
	
}
