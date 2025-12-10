package String;

public class CountSpaces {
public static void main(String[] args) {
	String s="  Good Morning    ";
	int c=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch==' ')
			c++;
	}
	System.out.println("No.of Spaces: "+c);
}
}
