package NumberPrograms_Practice;

public class Product_Of_Factors {
public static void main(String[] args) {
	int n=10;
	int pro=1;
	 for(int i=1;i<=n;i++) {
		 if(n%i==0) {
			 pro=pro*i;
		 }
	 }
	 System.out.println("Product of Factors are: "+pro);
}
}
