package NumberPrograms_Practice;

public class CountNumberOfDigit {
public static void main(String[] args) {
	int n=4521745;
	int c=0;
	while(n!=0) {
		c++;
		n=n/10;	
	}
	System.out.println(c);
}
}
