package Number_Programs;

public class SpyNumber {
public static void main(String[] args) {
	int n=123,sum=0,pro=1;
	
	while(n>0) {
		int rem=n%10;
		sum = sum+rem;
		pro=sum*rem;
		n=n/10;
	}
	System.out.println(sum+" : "+pro);
	if(sum==pro) {
		System.out.println("Spy Number");
	}
	else {
		System.out.println("Not a Spy Number");
	}
}
}
