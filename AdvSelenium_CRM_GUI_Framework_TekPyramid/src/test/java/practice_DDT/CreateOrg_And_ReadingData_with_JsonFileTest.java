package practice_DDT;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateOrg_And_ReadingData_with_JsonFileTest {

	@Test
	public void createOrgtest() throws Throwable, IOException {
		//read common data from Json file
		JSONParser parser=new JSONParser();

		Object obj=parser.parse( new FileReader("C:\\Users\\Administrator\\Desktop\\appCommonData.json"));
		JSONObject map= (JSONObject)obj;

		String URL=(String) map.get("url");//we can add to string() instead of (String)
		String BROWSER=(String) map.get("browser");
		String USERNAME=map.get("username").toString();
		String PASSWORD =map.get("password").toString();

		//generate the random number
		Random random= new Random();
		int random_num=random.nextInt(1000);
		//read the data from the excel file
		FileInputStream fis1= new FileInputStream("C:\\Users\\Administrator\\Desktop\\TestScriptdata.xlsx");
		Workbook wb= WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet("org");
		Row row = sheet.getRow(4);
		String orgname=row.getCell(3).toString() +random_num;
		wb.close();

		WebDriver driver=null;
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//step 1 login 
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
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
		Actions action=new Actions(driver);
		WebElement signout_img = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		action.moveToElement(signout_img).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		WebElement signout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		//signout.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign Out']")));
		element.click();

		driver.quit();
	}
}
