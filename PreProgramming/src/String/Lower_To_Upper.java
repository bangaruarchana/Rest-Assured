package String;

public class Lower_To_Upper {
public static void main(String[] args) {
	String s="archana";
	for(int i=0;i<s.length();i++) {
		System.out.print((char)(s.charAt(i)-32));
	}
}
}
