package NumberPrograms_Practice;

public class NeonNumber {
public static void main(String[] args) {
	int n=5,sq=n*n,sum=0;
	while(sq!=0) {
		int rem=sq%10;
		sum=sum+rem;
		sq=sq/10;
	}
	if(sum==n) {
		System.out.println(n+" is a Neon Number");
	}
	else {
		System.out.println(n+" is not a Neon Number");
	}
}
}
