package Interview_Practice;
public class NumberStrats_From_EvenOrOdd {
public static void main(String[] args) {
	 int n=13253;
	 while(n>9) {
		 n=n/10;
	 }
	 if(n%2==0) {
		 System.out.println("Number starts with Even");
	 }
	 else {
		 System.out.println("Number starts with Odd");
	 }
}
}
