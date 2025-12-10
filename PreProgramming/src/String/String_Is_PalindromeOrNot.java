package String;

public class String_Is_PalindromeOrNot {
public static void main(String[] args) {
	String s="Level";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		rev=rev+ch;
	}
	if(s.equalsIgnoreCase(rev))
		System.out.println("palindrome");
	else
		System.out.println("not a Palindrome");
}
}
