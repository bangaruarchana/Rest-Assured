package practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeOrg {
public static void main(String[] args) throws Exception {
	FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\Desktop\\commondata.properties");
	Properties prop= new Properties();
	prop.load(fis);
	
	String URL=prop.getProperty("url");
	String USERNAME=prop.getProperty("username");
	String PASSWORD=prop.getProperty("password");
	String ORGANISATION_NAME=prop.getProperty("organaisation");
	String PHONE_NO=prop.getProperty("phone");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(URL);
	Actions action=new Actions(driver);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
	driver.findElement(By.name("accountname")).sendKeys(ORGANISATION_NAME);
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	driver.findElement(By.id("phone")).sendKeys(PHONE_NO);
	driver.findElement(By.name("button")).click();
	
	WebElement verification=driver.findElement(By.linkText("Organizations"));
	verification.isDisplayed();
	WebElement signout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
	action.moveToElement(signout).click().perform();
	driver.findElement(By.linkText("Sign Out")).click();
	
	driver.close();
}
}
