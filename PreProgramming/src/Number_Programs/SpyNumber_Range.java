package Number_Programs;

public class SpyNumber_Range {
public static void main(String[] args) {
	for(int n1=1;n1<=1000;n1++) {
		int n=n1, sum=0,pro=1;
		while(n>0) {
			int rem =n%10;
			sum = sum+rem;
			pro= pro*rem;
			n=n/10;
		}
		if(sum==pro) {
			System.out.println(n1);
		}
	}
}
}
