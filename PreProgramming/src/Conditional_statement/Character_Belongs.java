package Conditional_statement;

public class Character_Belongs {
public static void main(String[] args) {
	char ch = '3';
	if(ch>='A'&& ch<='Z') {
		System.out.println("Uppercase");
	}
	else if(ch>='a'&& ch<='z') {
		System.out.println("Lowercase");
	}
	else if(ch>='0' && ch<='9') {
		System.out.println("Number");
	}
	else {
		System.out.println("Special character");
	}
}
}
