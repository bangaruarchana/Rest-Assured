package Number_Programs;

public class Looping_Program {
public static void main(String[] args) {
	//Intialization  condition   updation//
	for(int i=1;i<=2;i++) {
		for(int j=1;j<=4;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("-------Nested While Loop----------");
	int i=1;
	while(i<=2) {
		int j=1;
		while(j<=4) {
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		i++;
	}
	
	System.out.println("-------Nested do while loop-----------");
	int row=1;
	do {
		int col=1;
		do {
			System.out.println(col+" ");
			col++;
		}
		while()
	}
}
 
}
