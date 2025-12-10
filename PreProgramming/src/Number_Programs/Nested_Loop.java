package Number_Programs;

public class Nested_Loop {
public static void main(String[] args) {
	System.out.println("-----Nested While Loop-----");
	int i=1;//intialization//
	while(i<=2)//condition//
	{
		int j=1; 
		while(j<=4) //condition//
		{
			System.out.println(j+" ");
			j++;//updation//
		}
		System.out.println();
		i++;
	}
	System.out.println("----Nested do-while Loop----");
	int row=1;//ini
	do {
		int col=1;//ini
		do {
			System.out.println(col+" ");
			col++;//upd
		}
		while(col<=4);//con
		System.out.println();
		row++;//upd
	}
	while(row<=2);//con
	
		
	
	
	
}
}
