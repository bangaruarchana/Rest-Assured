package Conditional_statement;
public class PassOrFail_BasedOn_Grade {
public static void main(String[] args) {
	char grade ='F';
	if(grade=='A') {
		System.out.println("First Class");
	}
	else if(grade=='B') {
		System.out.println("Second Class");
	}
	else if(grade=='C') {
		System.out.println("Third Class");
	}
	else if(grade=='D') {
		System.out.println("Fail");
	}
	else {
		System.out.println("Failed completely");
	}
}
}
