package cn.heweiming.ssm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.UUID;

import org.joda.time.LocalDateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import cn.heweiming.ssm.properties.RSAEncryptionProperties;

/**
 * @author heweiming  2017年9月23日 下午5:20:39
 * @version 1.0.0
 * @description 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// @ActiveProfiles(profiles = { "default", "test" })
public class SSMApplicationTest {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(SSMApplicationTest.class);

    @Autowired
    private Environment env;

    @Autowired
    private RSAEncryptionProperties encryptionProperties;

    @Test
    public void test() {
        String[] profiles = env.getActiveProfiles();
        for (String profile : profiles) {
            System.err.println(profile);
        }

        String publicKey = encryptionProperties.getPublicKey();
        System.err.println(publicKey);
    }

    @Test
    public void testRsa() throws NoSuchAlgorithmException, InvalidKeySpecException {
        RSAPublicKey publicKey = encryptionProperties.parsePublicKey();
        RSAPrivateKey privateKey = encryptionProperties.parsePrivateKey();
        Algorithm algorithm = Algorithm.RSA512(publicKey, privateKey);

        LocalDateTime now = LocalDateTime.now();

        String token = JWT.create()//
                .withJWTId(UUID.randomUUID().toString())//
                .withSubject("admin")//
                .withIssuer("heweiming")//
                .withAudience("admin", "user")//
                .withIssuedAt(now.toDate())//
                .withExpiresAt(now.plusMinutes(30).toDate())//
                .withNotBefore(now.toDate())//
                .sign(algorithm);
        logger.error(token);

    }

}
