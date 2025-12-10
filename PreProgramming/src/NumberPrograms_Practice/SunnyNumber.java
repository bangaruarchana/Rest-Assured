package NumberPrograms_Practice;

public class SunnyNumber {
public static void main(String[] args) {
	int n=10;
	int n1=n+1; boolean flag=false;
	for(int i=1;i<=n/2;i++) {
		if(n1==i*i) {
			flag=true;
			break;
		}
	}
	if(flag==true) {
		System.out.println("Sunny Number");
	}
	else {
		System.out.println("Not a Sunny Number");
	}
}
}
