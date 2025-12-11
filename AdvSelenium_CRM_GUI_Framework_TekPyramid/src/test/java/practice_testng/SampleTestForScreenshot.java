package practice_testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class SampleTestForScreenshot {

	@Test
	public void amazonTest() throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//step:1 create an object to EventFiringWebDriver
		EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
		
		//step: 2 use getscreenshotAs method to get file type of screenshot
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		
		//step: 3store screenshot on local driver
		FileUtils.copyFile(srcFile, new File("./screenshot/test.png"));
	}
}