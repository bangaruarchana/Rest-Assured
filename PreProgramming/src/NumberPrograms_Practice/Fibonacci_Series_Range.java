package NumberPrograms_Practice;

public class Fibonacci_Series_Range {
public static void main(String[] args) {
	int n1=0,n2=1,n3,starting=5,ending=50;
	for(int i=starting;i<=ending;i++) {
		if(n1>=starting&&n1<=ending) {
			System.out.println(n1);
		}
		n3=n1+n2;
		n1=n2;
		n2=n3;
	}
	
}
}
