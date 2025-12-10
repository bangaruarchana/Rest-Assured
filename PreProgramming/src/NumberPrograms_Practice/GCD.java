package NumberPrograms_Practice;

public class GCD {
public static void main(String[] args) {
	int n1=8,n2=12,gcd=0;
	for(int i=1;i<=n1/2 && i<=n2/2; i++) {
		if(n1%i==0 && n2%i==0) {
			gcd=i;
		}
	}
	System.out.println(gcd);
}
}
