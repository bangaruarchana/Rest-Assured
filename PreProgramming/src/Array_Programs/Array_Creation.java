package Array_Programs;
import java.util.Scanner;
public class Array_Creation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an Array");
	int size=sc.nextInt();
	
	int[]a=new int[size];
	System.out.println("Enter Array Elements");
	
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Array Elements are:");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	
	
	
	}
}
