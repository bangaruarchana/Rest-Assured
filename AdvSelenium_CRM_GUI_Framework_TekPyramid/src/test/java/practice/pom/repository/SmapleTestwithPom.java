package practice.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SmapleTestwithPom {

	@FindBy(name="user_name")
	private WebElement ele1;

	@FindBy(name="user_password")
	private WebElement ele2;

	public WebElement getEle1() {
		return ele1;
	}

	public WebElement getEle2() {
		return ele2;
	}

	public WebElement getEle3() {
		return ele3;
	}

	@FindAll({@FindBy(id="submitButton"), @FindBy(xpath="//input[@value=\"Login\"]")})
	private WebElement ele3;

	@Test
	public void SampleTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		SmapleTestwithPom s=PageFactory.initElements(driver,SmapleTestwithPom.class);
		s.ele1.sendKeys("admin");
		s.ele2.sendKeys("admin");
		s.ele3.click();
		driver.quit();
		//		driver.navigate().refresh();//when we use pom it will handle the stale element exception though we refresh the page
		//		s.ele1.sendKeys("admin");//it will take the latest address of the element after refreshing
		//		s.ele2.sendKeys("admin");
		//		s.ele3.click();
	}
}
