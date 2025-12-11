package practice_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launch_Browser {

@Test 
public void Launch_ChromeBrowser() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chat.chatbotapp.ai/?model=gpt-3.5");
	driver.quit();
}
}
