package encryption;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptAndDecryptUtility {
//privatekey:Ac03tEam@j!tu_#1
	 public static String encrypt(String input, String secretKey) throws Exception {
	        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");
	        IvParameterSpec iv = new IvParameterSpec("4234567890123456".getBytes());
	        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	        cipher.init(Cipher.ENCRYPT_MODE, key,iv);
	        byte[] encryptedBytes = cipher.doFinal(input.getBytes());
	        return Base64.getEncoder().encodeToString(encryptedBytes);
	    }
	    
	    // Decrypt method
	    public static String decrypt(String input, String secretKey) throws Exception {
	    	
	    	 SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");
	         IvParameterSpec iv = new IvParameterSpec("4234567890123456".getBytes());
	        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); // Same as encryption
	        cipher.init(Cipher.DECRYPT_MODE, key, iv);

	        byte[] original = cipher.doFinal(Base64.getDecoder().decode(input));
	        return new String(original);
	    }
}
