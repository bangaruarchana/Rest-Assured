package Number_Programs;

public class Count_Digit {
public static void main(String[] args) {
	int n=254845,c=0;
	while(n>0) {
		c++;
		n=n/10;
	}
	System.out.println("No of digits: "+c);
}
}
