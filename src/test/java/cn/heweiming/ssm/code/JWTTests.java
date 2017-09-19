package cn.heweiming.ssm.code;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.junit.Test;

import cn.heweiming.ssm.crypto.RSACryptography;

public class JWTTests {

    @Test
    public void test() {
        try {

            KeyPair keyPair = RSACryptography.genKeyPair(1024);
            RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
            RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

            System.err.println(new String(Base64.getEncoder().encode(publicKey.getEncoded())));
            System.err.println(new String(Base64.getEncoder().encode(privateKey.getEncoded())));

            String plaintext = "heweiming89";
            byte[] ciphertextBytes = RSACryptography.encrypt(plaintext.getBytes(), publicKey);
//            System.err.println(new String(ciphertextBytes));
            byte[] plaintextBytes = RSACryptography.decrypt(ciphertextBytes, privateKey);
//            System.err.println(new String(plaintextBytes));

        } catch (IllegalArgumentException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
                | IllegalBlockSizeException | BadPaddingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testJwt() {
        
        Map<String, String> header = new LinkedHashMap<>();
        header.put("alg", "HS256");
        header.put("typ", "JWT");

    }

}
