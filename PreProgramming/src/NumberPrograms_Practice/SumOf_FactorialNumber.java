package NumberPrograms_Practice;

public class SumOf_FactorialNumber {
public static void main(String[] args) {
	int n=145; int sum=0;
	while(n!=0) {
		int rem=n%10;
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		System.out.println(rem+"--->Factorial is: "+fact);
		sum=sum+fact;
		n=n/10;
	}
	System.out.println("Sum of Factorial is: "+sum);
	 
}
}
