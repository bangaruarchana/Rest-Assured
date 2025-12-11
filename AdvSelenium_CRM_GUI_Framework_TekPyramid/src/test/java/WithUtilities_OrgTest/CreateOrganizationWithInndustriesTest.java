package WithUtilities_OrgTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationWithInndustriesTest {

	public static void main(String[] args) throws Exception {
		//Fetching the common data from the property file
		FileInputStream fis=new FileInputStream("./configAppData/commondata.properties");
		Properties prop= new Properties();
		prop.load(fis);
	String Browser=	prop.getProperty("browser");
	String Url=prop.getProperty("url");
	String Username=prop.getProperty("username");
	String Password=prop.getProperty("password");

	//creating Random Number
	Random ran=new Random();
	int ran_Num = ran.nextInt();
	
	//Fetching the testScript data
	FileInputStream fis1=new FileInputStream("./testScriptData/TestScriptdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis1);
	Sheet sh = wb.getSheet("org");
	Row row = sh.getRow(4);
	String orgName = row.getCell(2).toString()+ran_Num;
	String industry = row.getCell(3).toString();
	String type = row.getCell(4).toString();
	
	wb.close();

	//Achieving polymorphism because during runtime we can able to select the particular browser
	WebDriver driver=null;
	if(Browser.equals("chrome")) {
		driver= new ChromeDriver();
	}
	else if (Browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else if (Browser.equals("edge")) {
		driver=new EdgeDriver();
	}
	else {
		driver=new ChromeDriver();
	}
	
	//Actual Script Creating Orgnasation
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(Url);
	driver.findElement(By.name("user_name")).sendKeys(Username);
	driver.findElement(By.name("user_password")).sendKeys(Password);
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
	driver.findElement(By.name("accountname")).sendKeys(orgName);
	
	//select the industry and type
	WebElement selindustry = driver.findElement(By.name("industry"));
	Select sel=new Select(selindustry);
	sel.selectByValue("Energy");
	
	WebElement seltype = driver.findElement(By.name("accounttype"));
	Select sel1=new Select(seltype);
	sel1.selectByValue("Press");
	driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	
	//Verying the industries and type info
	String actualindustry=driver.findElement(By.id("dtlview_Industry")).getText();
	if(actualindustry.equals(industry)) {
		System.out.println(industry + " industry has been selected===PASS");
	}
	else {
		System.out.println(industry + " industry has been not selected===FAIL");
	}
	String actualtype=driver.findElement(By.id("dtlview_Type")).getText();
	if(actualtype.equals(type)) {
		System.out.println(type + " type has been selected===PASS");
	}
	else {
		System.out.println(type + " type has been not selected===FAIL");
	}
	
	Actions act=new Actions(driver);
	WebElement adminImg = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
	act.moveToElement(adminImg).click().perform();
	driver.findElement(By.partialLinkText("Sign Out")).click();
	driver.close();
	}
	
}

