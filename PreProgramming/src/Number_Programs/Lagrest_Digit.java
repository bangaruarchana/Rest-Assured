package Number_Programs;

public class Lagrest_Digit {
public static void main(String[] args) {
	int n=4857,temp=n;
	int max=n%10;
	while(n>0) {
		int rem =n%10;
		if(rem>max) {
			max=rem;
		}
		n=n/10;
	}
	System.out.println("Lagrest number is " +temp+" is : "+max);
}
}
