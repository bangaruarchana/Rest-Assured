package Number_Programs;
import java.util.Scanner;
public class Do_While {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int ch;
	do {
		System.out.println("-----Welcome----");
		System.out.println("Do you want me to print again\n1.Yes\n2.No");
		ch=sc.nextInt();
	//	System.out.println("----Thank you----");
		}
	while(ch==1);
}
}
