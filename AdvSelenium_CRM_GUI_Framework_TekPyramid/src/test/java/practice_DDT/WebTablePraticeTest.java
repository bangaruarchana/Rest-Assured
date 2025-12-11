package practice_DDT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablePraticeTest {

	@Test
	public void gettingtablerow() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.prokabaddi.com/");
//		List<WebElement> tablerow = driver.findElements(By.xpath("(//div[@class=\"row-head\"])[position() mod 2=0]"));
//		for(WebElement eventabledata:tablerow) {
//			System.out.println(eventabledata.getText());
//		}
		List<WebElement> tablerow = driver.findElements(By.xpath("(//div[@class=\"row-head\"])[position() mod 2=1]"));
	for(WebElement oddtabledata:tablerow) {
			System.out.println(oddtabledata.getText());		}
		
		driver.close();
	}
}
