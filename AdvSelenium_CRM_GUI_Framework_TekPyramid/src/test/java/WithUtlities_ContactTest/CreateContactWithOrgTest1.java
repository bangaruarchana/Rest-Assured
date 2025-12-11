package WithUtlities_ContactTest;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateContactWithOrgTest1 {	
		@Test
		public void testcase1() throws Exception {
			FileInputStream fis = new FileInputStream("./configAppData/commondata.properties");
			Properties p = new Properties();
			p.load(fis);

			String Browser = p.getProperty("browser");
			String Url = p.getProperty("url");
			String Username = p.getProperty("username");
			String Password = p.getProperty("password");

			// generate random number
			Random random = new Random();
			int randomint = random.nextInt(1000);

//			Reading Test Script data(Excel Data) from excel file
			FileInputStream fis1 = new FileInputStream("./testScriptData/TestScriptdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis1);
			Sheet sh = wb.getSheet("contact");
			Row row = sh.getRow(7);
			String orgname = row.getCell(2).toString() + randomint;
			String lastname = row.getCell(3).toString();
			wb.close();

			WebDriver driver = null;
			if (Browser.equals("chrome")) {
				driver = new ChromeDriver();
			} else if (Browser.equals("firefox")) {
				driver = new FirefoxDriver();
			} else if (Browser.equals("edge")) {
				driver = new EdgeDriver();
			} else {
				driver = new ChromeDriver();
			}

//			1. Login to Application
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(Url);

			driver.findElement(By.name("user_name")).sendKeys(Username);
			driver.findElement(By.name("user_password")).sendKeys(Password);
			driver.findElement(By.id("submitButton")).click();
			// 2. Navigate to Organization Module
			driver.findElement(By.linkText("Organizations")).click();

//			3. Click on Create Organization button
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

//			4. Enter all details and create new organization
			driver.findElement(By.name("accountname")).sendKeys(orgname);
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			
			// verify header phone number info expected result
			String header = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if (header.contains(orgname)) {
				System.out.println(orgname + "is created and ------->PASS");
			} else {
				System.out.println(orgname + "is  not created and ------->FAIL");
			}
			// step 5 navigate to the contact module
			driver.findElement(By.linkText("Contacts")).click();
			// step 6
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

			// step 7 enter the details and create new organisation
			driver.findElement(By.name("lastname")).sendKeys(lastname);
			driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
			// switch to child window
			Set<String> set = driver.getWindowHandles();

			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String windowid = it.next();
				driver.switchTo().window(windowid);
				String acturl = driver.getCurrentUrl();
				if (acturl.contains("module=Accounts")) {
					break;
				}

			}

			driver.findElement(By.name("search_text")).sendKeys(orgname);
			driver.findElement(By.name("search")).click();
			driver.findElement(By.xpath("//a[text()='" + orgname + "']")).click();

			// switch to parent window
			Set<String> set1 = driver.getWindowHandles();

			Iterator<String> it1 = set1.iterator();
			while (it1.hasNext()) {
				String windowid = it1.next();
				driver.switchTo().window(windowid);
				String acturl = driver.getCurrentUrl();
				if (acturl.contains("Contacts&action")) {
					break;
				}

			}
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			//verify  header message expected result
			String header1=	driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			if(header1.contains(orgname))
			{
				System.out.println(orgname + "is created and ------->PASS");
			}
			else {
				System.out.println(orgname + "is  not created and ------->FAIL");
			}
			
			//verifying Header orgName info Expected Result
			String actorgname=driver.findElement(By.id("mouseArea_Organization Name")).getText();
			System.out.println(actorgname);
			if (actorgname.trim().equals(orgname))
			{
				System.out.println(orgname + "information is created==PASS");
			}
			else {
				System.out.println(orgname + "information is not created==FAIL");
			}
			driver.quit();
			

		}
	}

