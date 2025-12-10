package NumberPrograms_Practice;

public class Factors {
public static void main(String[] args) {
	int n=10;
	System.out.println("Factors of the No are: ");
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
}
}
