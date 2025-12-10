package encryption;

import org.testng.annotations.Test;

public class AES_EncryptTest {

	@Test
	public void AESEncrypt() throws Exception {
		String privatekey ="Ac03tEam@j!tu_#1";
		//String data="deepak";
		String data="{\"createdBy\":\"Krishna\",\"status\":\"Created\"}";
				
				
		
		EncryptAndDecryptUtility ed=new EncryptAndDecryptUtility();
		System.out.println(ed.encrypt(data, privatekey));
		
		System.out.println(ed.decrypt("GDNStF3z2B/4HJE1kPzwCsca8vB8zkvv50lFHwBth+fdvgOn4gBjP1yYC/I6+6Uc", privatekey));
	}
}
