package NumberPrograms_Practice;

public class Composite_Number_Or_Not {
public static void main(String[] args) {
   int n=12;
   int c=0;
   for(int i=1;i<=n;i++) {
	   if(n%2==0) {
		   c++;
	   }
   }
   if(c>2) {
	   System.out.println("Given no is Composite No");
   }
   else {
	   System.out.println("Given no is not a Composite No");
   }
}
}
