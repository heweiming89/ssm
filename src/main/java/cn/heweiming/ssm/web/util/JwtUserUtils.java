package cn.heweiming.ssm.web.util;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import cn.heweiming.ssm.properties.RSAEncryptionProperties;

public class JwtUserUtils {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(JwtUserUtils.class);

    public static String getToken(HttpServletRequest request) throws NoSuchAlgorithmException, InvalidKeySpecException {
        String token = request.getHeader(HttpHeaders.AUTHORIZATION);
        return token;
    }

    private static WebApplicationContext getWebApplicationContext(HttpServletRequest request) {
        return WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
    }

    private static Environment getEnvironment(HttpServletRequest request) {
        WebApplicationContext applicationContext = getWebApplicationContext(request);
        return applicationContext.getEnvironment();
    }

    public static Algorithm getAlgorithm(HttpServletRequest request)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        WebApplicationContext context = getWebApplicationContext(request);
        RSAEncryptionProperties encryptionProperties = context.getBean(RSAEncryptionProperties.class);
        RSAPublicKey publicKey = encryptionProperties.parsePublicKey();
        RSAPrivateKey privateKey = encryptionProperties.parsePrivateKey();
        Algorithm algorithm = Algorithm.RSA512(publicKey, privateKey);
        return algorithm;
    }

    private static String getIssuer(HttpServletRequest request) {
        Environment env = getEnvironment(request);
        String issuer = env.getProperty("spring.application.name");
        logger.debug("issuer: {}", issuer);
        return issuer;
    }

    public static String getCurrentUser(HttpServletRequest request)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        JWTVerifier verifier = JWT.require(getAlgorithm(request))//
                .withIssuer(getIssuer(request))//
                .build();
        DecodedJWT jwt = verifier.verify(getToken(request));
        String subject = jwt.getSubject();
        return subject;
    }

    public static boolean verifyToken(HttpServletRequest request, JWTVerifier verifier)
            throws JWTVerificationException, NoSuchAlgorithmException, InvalidKeySpecException {
        verifier.verify(getToken(request));
        return true;
    }

}
