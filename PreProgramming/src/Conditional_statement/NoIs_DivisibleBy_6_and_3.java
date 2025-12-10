package Conditional_statement;

public class NoIs_DivisibleBy_6_and_3 {
public static void main(String[] args) {
	int n=9;
	
	if(n%2==0) {
		if(n%6==0) {
			System.out.println("No is Even and it is divided by 6");	
		}
		else
		{
		System.out.println("No is Even but not it is divisible by 6");	
		}
		 }
     	else {
	if(n%3==0) {
		System.out.println("No is Odd and it is divisble by 3");
	}
	else {
		System.out.println("No is odd but not disible by by 3");
	}
	}
}
}
