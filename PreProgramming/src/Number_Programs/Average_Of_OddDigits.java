package Number_Programs;

public class Average_Of_OddDigits {
public static void main(String[] args) {
	int n=124586;
	int sum=0,c=0;
	while(n>0) {
		int rem=n%10;
		if(rem%2==1) {
			sum=sum+rem;
			c++;
		}
		n=n/10;
	}
	double avg=sum/c;
	System.out.println("Average of Odd Digit is: "+sum/c );
}
}
