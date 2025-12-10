package String;

public class Count_Lettrs_Numbers_SpecialChar {
public static void main(String[] args) {
	String s= "Tom5757@gmail.com";
	s=s.toLowerCase();
	int l=0;int d=0;int sp=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if (ch>='a' && ch<='z')
			l++;
		else if(ch>='0' && ch<='9')
			d++;
		else
			sp++;
}
	System.out.println("Letters :" +l);
	System.out.println("Numbers :" +d);
	System.out.println("Special Character :" +sp);
}
}