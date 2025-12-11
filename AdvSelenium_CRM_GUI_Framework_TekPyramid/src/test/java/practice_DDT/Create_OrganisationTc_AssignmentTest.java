package practice_DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_OrganisationTc_AssignmentTest {

	public static void main(String[] args) throws IOException {

		//read common data from the property file
		FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Desktop\\OrgCommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);

		String Browser=prop.getProperty("browser");
		String Url=prop.getProperty("url");
		String Username=prop.getProperty("username");
		String Password=prop.getProperty("password");

		//generate the random number
		Random random= new Random();
		int random_num=random.nextInt(1000);
		//read the data from the excel file
		FileInputStream fis1= new FileInputStream("C:\\Users\\Administrator\\Desktop\\TestScriptdata.xlsx");
		Workbook wb= WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet("org");
		Row row = sheet.getRow(4);
		String orgname=row.getCell(2).toString() +random_num;
		wb.close();

		WebDriver driver=null;
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(Browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		if(Browser.equals("edge")) {
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//step 1 login 
		driver.get(Url);
		driver.findElement(By.name("user_name")).sendKeys(Username);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();

		//step 2 navigating to the organisation module
		driver.findElement(By.linkText("Organizations")).click();

		//step 3 click on create organisation button
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();

		//step 4 enter all the details and create new organisation
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[2]")).click();

		//step 5 logout
		 
		 WebElement Adminstaror_img = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
			Actions action=new Actions(driver);
			action.moveToElement(Adminstaror_img).perform();
			driver.findElement(By.linkText("Sign Out")).click();
			
		//driver.quit();

	}
}
