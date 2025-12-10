package Basics;
import java.util.Scanner;
public class Smallest_Among_Two {
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		
		System.out.println("Enter b value");
		int b = sc.nextInt();
		 System.out.println("*****************");
		 String res = a<b ?"a is smaller" : "b is smaller";
		 System.out.println(res);
		 
	}
	
	
	
}
