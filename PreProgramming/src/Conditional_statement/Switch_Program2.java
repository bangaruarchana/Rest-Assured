package Conditional_statement;
import java.util.Scanner;
public class Switch_Program2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("-------Simple Calci--------");
	System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	System.out.println();
	System.out.println("Enter choice");
	int choice = sc.nextInt();
	System.out.println("Enter the two values");
	int a = sc.nextInt();
	int b = sc.nextInt();
	switch(choice) {
	case 1:
	{
		System.out.println("Addition:"+(a+b));
	}
	break;
	case 2:
	{
		System.out.println("Subtraction:"+(a-b));
	}
	break;
	case 3:
	{
		System.out.println("Multiplication:"+(a*b));
	}
	break;
	case 4:
	{
		System.out.println("Division:"+(a/b));
	}
	break;
	default :
	{
		System.out.println("Invalid choice");
	}
	}
	 
}
}
