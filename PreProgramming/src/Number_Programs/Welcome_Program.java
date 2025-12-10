package Number_Programs;
import java.util.Scanner;
public class Welcome_Program {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice;
	 do {
		 System.out.println("----------Welcom------------");
		 System.out.println("Do you want me to repeat again\n1.Yes 2.No");
		 choice= sc.nextInt();
		  
	 }
	 while(choice==1);
	 if(choice==2) {
		 System.out.println("Thank you");
	 }
}
}
