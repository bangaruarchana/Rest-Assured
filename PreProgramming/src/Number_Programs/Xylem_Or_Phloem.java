package Number_Programs;

public class Xylem_Or_Phloem {
public static void main(String[] args) {
	int n=1234, osum=0,isum=0;
	int last=n%10;n=n/10;
	while(n>=10) {
		int rem=n%10;
		isum=isum+rem;
		n=n/10;
	}
	osum=n+last;
	if(osum==isum) {
		System.out.println("Xylem");
	}
	else {
		System.out.println("Phloem");
	}
	 
}
}
