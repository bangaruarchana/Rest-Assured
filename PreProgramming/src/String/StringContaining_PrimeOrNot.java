package String;

public class StringContaining_PrimeOrNot {
public static void main(String[] args) {
	String s="apple";
	System.out.println("Prime Characters are:");
	for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		 int n=ch;
		 //check n is prime
		 int c=0;
		 for(int j=1;j<=n;j++) {
			 if(n%j==0) {
				 c++;
			 }
		 }
		 if(c==2) {
			 System.out.print(ch+" ");
		 }
	}
	 
}
}
