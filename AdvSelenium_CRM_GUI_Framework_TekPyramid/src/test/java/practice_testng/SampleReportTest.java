package practice_testng;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class SampleReportTest {
	ExtentReports reports;
	@BeforeSuite
	public void configBS() {
		//Spark Report Config

		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Test Suite Result");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);

		//add Environment info & create test
		reports=new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("Operatig System","windows-10");
		reports.setSystemInfo("Browser", "CHROME-100");
	}

	@AfterSuite
	public void configAS() {
		reports.flush();
	}

	@Test 
	public void createContactTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	String filePath=ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentTest test=reports.createTest("createContactTest");
		test.log(Status.INFO, "login to the application");
		test.log(Status.INFO, "navigate to the contact page");
		test.log(Status.INFO, "create Contact");
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "contact is created");
		}
		else {
			//test.log(Status.FAIL, "contact is not created");
			test.addScreenCaptureFromBase64String(filePath,"Error File");
		}
		driver.close();
	}
	
	@Test
	public void createContactWithPhoneNumber() {
		ExtentTest test=reports.createTest("createContactWithPhoneNumber");
		test.log(Status.INFO, "login to the application");
		test.log(Status.INFO, "navigate to the contact page");
		test.log(Status.INFO, "create Contact with phoneNumber");
		if("123".equals("123")) {
			test.log(Status.PASS, "contact is created with phone no");
		}
		else {
			test.log(Status.FAIL, "contact is not created with phone no");
		}
	}
	@Test
	public void createContactWithOrg() {
		ExtentTest test=reports.createTest("createContactWithOrg");
		test.log(Status.INFO, "login to the application");
		test.log(Status.INFO, "navigate to the contact page");
		test.log(Status.INFO, "create Contact with Organization");
		if("ABC".equals("HDFC")) {
			test.log(Status.PASS, "contact is created with Org");
		}
		else {
			test.log(Status.FAIL, "contact is not created with Org");
		}
	}
}