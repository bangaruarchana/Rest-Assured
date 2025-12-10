package Number_Programs;

public class Extract_All_Digit {
public static void main(String[] args) {
	int n=47515;//Intialization
	while(n>0) //Condition
	{
		int rem=n%10;
		System.out.println(rem);
		n=n/10;//Udation
	}
}
}
