package String;

public class ToUpperCase {
public static void main(String[] args) {
	String s="apple@123";
	for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='a'&&ch<='z') {
			int n=ch-32;
			System.out.println((char)n);
		}
		else
			System.out.println(ch);
	}
	
}
}
