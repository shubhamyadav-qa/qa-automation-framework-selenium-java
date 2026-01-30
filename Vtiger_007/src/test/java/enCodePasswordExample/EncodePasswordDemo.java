package enCodePasswordExample;

import org.apache.commons.codec.binary.Base64;

public class EncodePasswordDemo {

	public static void main(String[] args) {
		
		
		// encode password
		String password ="admin123";
		
		byte[] encodePassword=Base64.encodeBase64(password.getBytes());
		System.out.println(new String(encodePassword));
	}
}
