package practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Readdata_From_JsonTest {

	public static void main(String[] args) throws Throwable, IOException, ParseException {

		//step 1: parse JSON physical file into java object using JSONParse class
//		FileInputStream fis=new FileInputStream("./src/test/resources/CommonDatawithJson/data.json");
//		Properties prop= new Properties();
		JSONParser parser=new JSONParser();
		
		Object obj=parser.parse( new FileReader("./src/test/resources/CommonDatawithJson/data.json"));
		
		//Object obj=parser.parse(fis);
		//step 2:convert java object into Json Object using downcasting 
		JSONObject map= (JSONObject)obj;

		//step 3: get the value from Json file using key
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("timeout"));


	}
}
