package cn.heweiming.ssm.crypto;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.junit.Test;

public class RSACryptoTest {

	@Test
	public void test() throws NoSuchAlgorithmException {
		KeyPair keyPair = RSACrypto.genKeyPair(1024);
		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();
		System.out.println(RSACrypto.base64Key(publicKey));
		System.out.println();
		System.out.println(RSACrypto.base64Key(privateKey));
	}

}
