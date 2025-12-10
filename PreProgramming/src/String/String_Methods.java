package String;

import java.util.Arrays;

public class String_Methods {
public static void main(String[] args) {
	String s1="java";
	String s2=new String("java");
	System.out.println(s1==s2);//0x1==0x2=>false
	
	System.out.println("-----Equals()-----");
	System.out.println(s1.equals(s2));//java->java=true
	
	System.out.println("-----Length()-----");
	System.out.println(s1.length());
	
	System.out.println("-----charAt()-----");
	System.out.println(s1.charAt(1));
	
	System.out.println("-----------");
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		System.out.println(ch);
	}
	System.out.println("-----toUpperCase()-----");
	System.out.println(s1.toUpperCase());
	System.out.println();
	
	System.out.println("-----toLoweCase()-----");
	String s="HELLO ARCHANA";
	System.out.println(s.toLowerCase());
	System.out.println();
	System.out.println("-----trim()-----");
	String t="    good morning   ";
	System.out.println(t.trim());
	System.out.println();
	
	System.out.println();
	//isEmpty and isBlank
	System.out.println("-----isEmpty and isBlank-----");
	String i="          ";
	System.out.println(i.isEmpty());
    System.out.println(i.isBlank());
    System.out.println();
    
    
	System.out.println("-----substring(int begin index)-----");
	String b="java programming language";
	System.out.println(b.substring(5));//programming language
	System.out.println();
	
	System.out.println("-----substring(int beginIndex,intEndIndex)-----");
	System.out.println(b.substring(5, 16));
	System.out.println();
	
	System.out.println("-----split()-----");
    String sp="Java is a programming language";
    String[] arr = sp.split("g");
    System.out.println(Arrays.toString(arr));
	
	
	
}
}
