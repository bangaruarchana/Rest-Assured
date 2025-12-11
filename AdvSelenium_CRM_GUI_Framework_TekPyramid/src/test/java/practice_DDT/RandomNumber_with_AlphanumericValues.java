package practice_DDT;

public class RandomNumber_with_AlphanumericValues {

	public static void main(String[] args) {
		int n=20;
		//choose a character random from the string
		String AlphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		//create StringBuffer size of Alphanumeric Sting
		StringBuffer sb= new StringBuffer(n);
		for(int i=0;i<n;i++) {
			int index=(int)(AlphaNumericString.length()*Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		System.out.println(sb);
	}
	

}
