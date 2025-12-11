package practice_DDT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ways_To_Send_A_DataInto_TextField {

	@Test
	public void usingsendKeys() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		WebElement searchtxt = driver.findElement(By.id("twotabsearchtextbox"));
		searchtxt.sendKeys("watches");
		System.out.println("data has entered using send keys method");
		driver.close();
	}
	@Test
	public void usingJavascriptexecutor() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		WebElement searchtxt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",searchtxt ,"watches");
		System.out.println("using javascript executor sending data");
		driver.close();
	}
	@Test
	public void usingActionClass() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		WebElement searchtxt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions action= new Actions(driver);
		action.sendKeys(searchtxt,"watches").perform();
		System.out.println("using Actions Class sending data");
		driver.close();
		
	}
	@Test
	public void usingRobotclass() throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		Robot r= new Robot();
		//r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_H);
		r.delay(1000);
		//r.keyRelease(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_A);
		r.delay(1000);
		//r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_I);
		r.delay(1000);
		//r.keyRelease(KeyEvent.VK_I);
		//r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		System.out.println("using robot class sending data");
		driver.close();
		
	}
}
