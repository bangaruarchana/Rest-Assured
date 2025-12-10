package Number_Programs;

public class Odd_Digit {
public static void main(String[] args) {
	int n=478218;
	while(n>0) {
		int rem=n%10;
		if(rem%2==1) {
			System.out.println(rem);
		}
		n=n/10;
			}
}
}
