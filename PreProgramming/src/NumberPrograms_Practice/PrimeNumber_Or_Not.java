package NumberPrograms_Practice;

public class PrimeNumber_Or_Not {
public static void main(String[] args) {
	int n=11; int c=0;
	for(int i=1;i<=n;i++) {
		if(n%i==2) {
			c++;
		}
	}
	if(c==2) {
		System.out.println("Prime Number");
	}
	else
	System.out.println("Not a Prime Number");
}
}
