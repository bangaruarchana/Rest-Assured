package practice_DDT;

import java.util.Random;

public class Generate_RandomNumber_Test {
 
	public static void main(String[] args) {
		Random random=new Random();
		int randomnum=random.nextInt(1000);
		
		System.out.println(randomnum);
	}
}
