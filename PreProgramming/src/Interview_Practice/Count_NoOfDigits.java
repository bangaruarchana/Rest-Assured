package Interview_Practice;

public class Count_NoOfDigits {
public static void main(String[] args) {
	 int n=472515; int c=0;
	 while(n!=0) {
		 c++;
		 n=n/10;
	 }
	 System.out.println(c);
}
}
