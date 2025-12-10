package NumberPrograms_Practice;

public class ProductOf_EachDigit {
public static void main(String[] args) {
	int n=1234; int pro=1;
	while(n!=0) {
		int rem=n%10;
		pro=pro*rem;
		n=n/10;
	}
	System.out.println("Product of the digits is: "+pro);
}
}
