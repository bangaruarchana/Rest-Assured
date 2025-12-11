package practice_DDT;

import org.testng.annotations.Test;

public class Read_RunTime_MavenParameterTest {

	@Test
	public void runtimeParameterTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println("Env Data===>"+URL);
		System.out.println("Browser Data===>"+BROWSER);
		System.out.println("Usename Data===>"+USERNAME);
		System.out.println("Password Data===>"+PASSWORD);
	}
}
