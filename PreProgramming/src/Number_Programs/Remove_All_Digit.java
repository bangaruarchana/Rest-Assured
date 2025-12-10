package Number_Programs;

public class Remove_All_Digit {
public static void main(String[] args) {
	int n=78546;
	while(n>0) {
		System.out.println("n value: "+n);
		n=n/10;
	}
	System.out.println("n value: "+n);
}
}
