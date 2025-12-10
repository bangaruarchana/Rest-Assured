package String;

public class ConvertFirstLetterTo_UpperCase {
public static void main(String[] args) {
	String s="archana";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(i==0 && (ch>='a' && ch<='z')) {
			int n=ch-32;//typecasting converting a to A 97-32=65==A so the first letter changed to Archan
			System.out.print((char)n);
		}
		else
			System.out.print(ch);
	}
}
}
