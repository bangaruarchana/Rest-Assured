package NumberPrograms_Practice;

public class Strong_Number {
public static void main(String[] args) {
	int n=145; int n1=n;  int sum=0;
	while(n!=0) {
		int rem=n%10;
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(sum==n1) {
		System.out.println("Given Number is Strong Number");
	}
	else {
		System.out.println("Given Number is not a Strong Number");
	}
}
}
