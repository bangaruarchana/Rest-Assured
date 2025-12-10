package Patterns;
public class Step2_Patterns {
public static void main(String[] args) {

	int n=4;

	System.out.println("-------Primary Dialgonal------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==j)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------Secondary Dialgonal------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i+j==n+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("------Z-shape---------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||i==n||i+j==n+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("------N-shape---------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||j==n||i==j)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------left-Arrow--------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||j==1||i==j)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("------Right-Arrow--------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||j==n||i+j==n+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("-------Down-Arrow--------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==n||j==n||i==j)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("---------X-shape--------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==j||i+j==n+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println("--------Box-------");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||i==n||j==1||j==n||i==j||i+j==n+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
































}
}
	 
