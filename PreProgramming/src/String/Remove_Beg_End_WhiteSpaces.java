package String;

public class Remove_Beg_End_WhiteSpaces {
public static void main(String[] args) {
	String s="  hel   lo  ";
	int st=0,en=s.length()-1;
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(st)=='')
			st++;
		if(s.charAt(en)=='')
			en--;
		
	}
	for(int i=st;i<=en;i++) {
		System.out.println(s.charAt(i));
	}
}
}
