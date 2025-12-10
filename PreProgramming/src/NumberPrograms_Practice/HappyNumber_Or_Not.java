package NumberPrograms_Practice;

public class HappyNumber_Or_Not {
public static void main(String[] args) {
	int n=12;
	while(true) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int sq=rem*rem;
			sum=sum+sq;
			n=n/10;
		}
		if(sum==1) {
			System.out.println("Happy Number");
			break;
		}
		else if(sum==4) {
			System.out.println("Sad Number");
			break;
		}
		n=sum;
	}
}
}
