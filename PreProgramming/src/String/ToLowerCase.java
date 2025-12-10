package String;

public class ToLowerCase {
public static void main(String[] args) {
	String s="APPLE@123";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		
		if(ch>='A'&&ch<='Z') {
			int n=ch+32;
			System.out.println((char)n);
		}
		else
			System.out.println(ch);
	}
}
}
