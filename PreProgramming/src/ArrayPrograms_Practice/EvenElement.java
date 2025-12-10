package ArrayPrograms_Practice;

import java.util.Scanner;

public class EvenElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size");
		int size= sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}
	}
 
}
