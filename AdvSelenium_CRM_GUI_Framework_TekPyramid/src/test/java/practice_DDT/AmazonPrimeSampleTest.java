package practice_DDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonPrimeSampleTest {

	@Test
	public void amazonPrime() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.primevideo.com/region/eu/addons");
		WebElement joinPrime = driver.findElement(By.xpath("(//a[@aria-label=\"Join Prime\"])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(joinPrime).click().perform();
		WebElement emailtxtfld = driver.findElement(By.id("id=\"ap_email\""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]","emailtxtfld","9963699179");
		driver.findElement(By.id("continue")).click();
		
		driver.close();
		
	}
}
