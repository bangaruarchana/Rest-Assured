package String;

public class Count_Vowels_Consontants_SP {
public static void main(String[] args) {
	String s="3reaf@*s13taoi";
	s=s.toLowerCase();
	int v=0,c=0,n=0,sp=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='u') {
			v++;
		}
		else if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
			n++;
		}
		else if((s.charAt(i)!='a'||s.charAt(i)!='e'||s.charAt(i)!='i'||s.charAt(i)!='o'||s.charAt(i)!='u')&&(s.charAt(i)>='a'&&s.charAt(i)<='z')) {
			c++;
		}
		else {
			sp++;
		}
	}
	System.out.println("Vowels :"+v);
	System.out.println("Consonants :"+c);
	System.out.println("Numbers :"+n);
	System.out.println("Special Character :"+sp);
}
}
