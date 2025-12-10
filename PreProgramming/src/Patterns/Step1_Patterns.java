package Patterns;

public class Step1_Patterns {
public static void main(String[] args) {
	System.out.println("----Box Shaped----");
	 int n=4;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n;j++) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }

		System.out.println("-----L-Shape------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || j==1) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
			 
		}
		System.out.println("-----oppo-L-shape------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n || j==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	
		System.out.println("-----Inverted-L-shape------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("-----oppo-Inverted-L-shape------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("--------Parallel------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("-----Eqaul------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------C-Shape--------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("-------oppo-C-Shape--------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==n || i==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("--------U-Shape-------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || i==n||j==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("------Inverted-U-Shape--------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || j==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("--------Box--------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 ||i==n|| j==1 || j==n) 
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
    	}
}




