package String;

import java.util.Arrays;

public class ConvertToCharArray {
 public static void main(String[] args) {
	String s="Welcome";
	char[]a1=s.toCharArray();
	System.out.println(Arrays.toString(a1));
	System.out.println("---------------------");
	char []a=new char[s.length()];
	
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		a[i]=ch;
	}
	System.out.println(Arrays.toString(a));
}
}
