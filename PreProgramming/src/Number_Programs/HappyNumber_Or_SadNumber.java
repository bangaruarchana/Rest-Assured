package Number_Programs;

public class HappyNumber_Or_SadNumber {
  public static void main(String[] args) {
	int n=23;
	while(true) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int sq=rem*rem;
			sum=sum+sq;
			n=n/10;
		}
		System.out.println(sum);
		
	}
}
}
