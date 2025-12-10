package NumberPrograms_Practice;

public class CompositeNumber_Range {
public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		int c=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				c++;
			}
		}
		if(c>2) {
			System.out.println(i);
		}
	}
}
}
