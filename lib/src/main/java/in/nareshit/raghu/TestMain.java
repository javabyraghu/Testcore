package in.nareshit.raghu;

import org.apache.commons.codec.binary.Base64;

public class TestMain {

	public static void main(String[] args) {
		byte[] arr = Base64.encodeBase64(args[0].getBytes());
		System.out.println(new String(arr));
		
	}
}
