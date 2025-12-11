package practice_DDT;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable_Program {

	@Test
	public void tablerow(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		List<WebElement> tablerow = driver.findElements(By.xpath("//tr"));
//		for(WebElement ele:tablerow) {
//			System.out.println(ele.getText());
//		}
//		Iterator<WebElement> iterator = tablerow.iterator();
//		while(iterator.hasNext()) {
//			String text = iterator.next().getText();
//			System.out.println(text);
//		}
		int text = tablerow.size();
		System.out.println(text);
		driver.close();
	}
	@Test
	public void tabletext() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		List<WebElement> tableheading = driver.findElements(By.xpath("//th"));
		for(WebElement heading:tableheading) {
			System.out.println(heading.getText());
		}
		driver.close();
		
	}
	@Test
	public void tabledata() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
//		List<WebElement> tabledata = driver.findElements(By.xpath("//td"));
//		for(WebElement data:tabledata) {
//			System.out.println(data.getText());
//		}
		//WebElement tablerowdata = driver.findElement(By.xpath("(//tr)[2]"));
		//System.out.println(tablerowdata.getText());
		List<WebElement> quantity = driver.findElements(By.xpath("//td[position() mod 2=0]"));
		for(WebElement ele:quantity) {
			System.out.println(ele.getText());
		}
		driver.close();
	}
	
}
