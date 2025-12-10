package Number_Programs;

public class Perfect_Square {
public static void main(String[] args) {
	int n=25;boolean flag=false;
	for(int i=1;i<=n/2;i++) {
		if(i*i==n) {
			flag=true;
			break;
		}
	}
	if(flag==true) {
		System.out.println("Perfect Square");
	}
	else {
		System.out.println("Not a Perfect Square");
	}
}
}
