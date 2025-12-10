package Number_Programs;

public class ArmStrong_Number {
public static void main(String[] args) {
	int n=124, ex=0;  int sum=0,n1=n, temp=n;
	while(n>0) {
		ex++;
		n=n/10;
	}
	System.out.println("Exponent is "+ex);
	while(n1>0) {
		int base=n1%10;
		//find power for extracted digit
		int pow=1;
		for(int i=1;i<=ex;i++) {
			pow=pow*base;
		}
		System.out.println(base+"--> "+pow);
		sum=sum+pow;
		n1=n1/10;
	}
	System.out.println("sum is: "+sum);
	if(sum==temp) {
		System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not a ArmStrong Number");
	}
		
}
}
