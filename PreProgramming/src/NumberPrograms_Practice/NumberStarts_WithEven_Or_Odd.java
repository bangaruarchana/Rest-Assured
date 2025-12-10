package NumberPrograms_Practice;

public class NumberStarts_WithEven_Or_Odd {
public static void main(String[] args) {
	int n=24526;
	while(n<10) {
		n=n/10;
	}
	if(n%2==0) {
		System.out.println("Number starts even");
	}
	else
		System.out.println("Number starts with odd");
}
}
