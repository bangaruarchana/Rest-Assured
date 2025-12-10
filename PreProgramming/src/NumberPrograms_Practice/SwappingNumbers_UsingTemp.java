package NumberPrograms_Practice;
public class SwappingNumbers_UsingTemp {
	public static void main(String[] args) {
		int a=20;int b=30;
		System.out.println("Berfore Swapping");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
}
