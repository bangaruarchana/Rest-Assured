 package Number_Programs;

public class Even_Digit {
public static void main(String[] args) {
	int n=45424;
	while(n>0) {
		int rem=n%10;
		if(rem%2==0) {
			System.out.println(rem);
		}
		n=n/10;
			}
}
}
