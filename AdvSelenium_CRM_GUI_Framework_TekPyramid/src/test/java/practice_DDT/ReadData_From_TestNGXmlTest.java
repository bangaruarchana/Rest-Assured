package practice_DDT;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadData_From_TestNGXmlTest {

	@Test
	public void sampleTest(XmlTest test) {
		System.out.println("exceuted sample Test");
	    System.out.println(test.getParameter("browser"));
	    System.out.println(test.getParameter("url"));
	    System.out.println(test.getParameter("username"));
	    System.out.println(test.getParameter("password"));
	}
	
}
