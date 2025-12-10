package NumberPrograms_Practice;

public class Xylem_Or_Phloem {
public static void main(String[] args) {
	int n=12345, is=0;
	int last=n%10;n=n/10;
	while(n>9) {
		int rem=n%10;
		is=is+rem;
		n=n/10;
	}
	int os=last+n;
	if(is==os) {
		System.out.println("Xylem");
	}
	else {
		System.out.println("Pholem");
	}
}
}
