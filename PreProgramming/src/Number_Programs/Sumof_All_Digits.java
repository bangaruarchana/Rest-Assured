package Number_Programs;

public class Sumof_All_Digits {
public static void main(String[] args) {
	int n=5842145,sum=0;
	while(n>0) {
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
		  
	}
	System.out.println("Sum is: "+sum);
}
}
