package NumberPrograms_Practice;

public class Palindrome_Or_Not {
public static void main(String[] args) {
	int n=122; int n1=n; int rev=0;
	while(n!=0) {
		int rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
	}
	if(n1==rev) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
		
	
}
}
