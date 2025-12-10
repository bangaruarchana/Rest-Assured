package Array_Programs;

import java.util.Arrays;

public class ReverseTheArray {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};

	int[]b=new int[a.length];
	int j=0;
	for(int i=a.length-1;i>=0;i--) {
		b[j]=a[i];
		j++;
	}
	System.out.println(Arrays.toString(b));
}
}
