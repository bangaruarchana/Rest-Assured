package NumberPrograms_Practice;

public class Greatest_Of_Three {
public static void main(String[] args) {
	int a=20;
	int b=45;
	int c=85;
	int res=a>b?(a>c?a:c) : (b>c?b:c);
	System.out.println(res);
	
}
}
