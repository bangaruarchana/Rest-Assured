package Patterns;

public class Step5_Patterns {
public static void main(String[] args) {
	int n=4;
	System.out.println("-------Butterfly------");
    for(int i=1;i<=n*2-1;i++) {
    	for(int j=1;j<=n*2-1;j++) {
    		if((i>=j&&i+j<=n*2)||(i+j>=n*2&&j>=i))
    			System.out.print("* ");
    		else 
    			System.out.print(" ");
    	}
    	System.out.println();
    }
  }
 }
	 
	
	 