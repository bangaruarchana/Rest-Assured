package Array_Programs;

public class PrimeElement {
public static void main(String[] args) {
	int[]a= {12,3,6,2,89,99,103,11};
	System.out.println("Prime Elements are: ");
	for(int i=0;i<a.length;i++) {
		int n=a[i];
		//check 'n' is prime 
		int c=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				c++;
			}
		}
		if(c==2)
			System.out.println(a[i]);
	}
}
}
