package Number_Programs;

public class Smallest_Digit {
public static void main(String[] args) {
	int n=4857,temp=n;
	int min=n%10;
	while(n>0) {
		int rem =n%10;
		if(rem<min) {
			min=rem;
		}
		n=n/10;
	}
	System.out.println("Lagrest number is " +temp+" is : "+min);
}
}

