package practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Sample_DataDrivenTesting {

	public static void main(String[] args) throws Exception {
		//step-1 create file input stream
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\Desktop\\commondata.properties");
		
		//step-2 create properties class load all the keys
		Properties prop= new Properties();
		prop.load(fis);
		
		//step-3 get the value based on the key
        System.out.println(prop.getProperty("password"));		
		
	}
}
