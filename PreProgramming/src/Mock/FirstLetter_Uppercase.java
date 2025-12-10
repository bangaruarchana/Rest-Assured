package Mock;

public class FirstLetter_Uppercase {
public static void main(String[] args) {
	String s="chashvika";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		 if(i==0&&(ch>='a'&&ch<='z')) {
			 System.out.println();
			 int n=ch-32;
			 System.out.println((char)n);
		 }
		 else {
			 System.out.println(ch);
		 }
			 
	}
}
}
