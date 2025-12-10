package String;

public class Reverse_A_String {
public static void main(String[] args) {
	String s=" mahadev";
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);
}
}
