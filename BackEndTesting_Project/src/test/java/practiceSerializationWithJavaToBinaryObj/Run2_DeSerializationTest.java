package practiceSerializationWithJavaToBinaryObj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Run2_DeSerializationTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./M.txt");
		
		ObjectInputStream input=new ObjectInputStream(fis);
		NFSGame user1obj=(NFSGame)input.readObject();
		
		System.out.println(user1obj.name);
		System.out.println(user1obj.level);
		System.out.println(user1obj.score);
		System.out.println(user1obj.life);
	}
}
