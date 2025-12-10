package practiceSerializationWithJavaToBinaryObj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


	class NFSGame implements Serializable{//without serializable interface we cannot achieve the serialization
		String name;
		int level;
		long score;
		int life;
		
		public  NFSGame(String name,int level,long score,int life) {
			super();
			this.name=name;
			this.level=level;
			this.score=score;
			this.life=life;
			
	}
	
	}
		public class Run1_SerializationTest {
			
		
	public static void main(String[] args) throws Throwable {
		NFSGame user1obj= new NFSGame("Archu",500,500000,2 );
		FileOutputStream fis=new FileOutputStream("./M.txt");
		
		ObjectOutputStream out=new ObjectOutputStream(fis);
		out.writeObject(user1obj);
		System.out.println("=========END==========");
		
	}
	
	}

