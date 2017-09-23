package cn.heweiming.ssm.properties;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import cn.heweiming.ssm.encryption.RSAEncryption;

/**
 * @author heweiming  2017年9月23日 下午5:17:54
 * @version 1.0.0
 * @description 
 */
@Component
@ConfigurationProperties(prefix = RSAEncryptionProperties.CONFIG_PROPERTIES_PREFIX)
@Validated
public class RSAEncryptionProperties {

    protected final static String CONFIG_PROPERTIES_PREFIX = "encryption.rsa";

    private String publicKey;

    @NotEmpty(message = "RSA密钥不能为空")
    private String privateKey;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public RSAPublicKey parsePublicKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
        return (RSAPublicKey) RSAEncryption.getPublicKey(this.publicKey);
    }

    public RSAPrivateKey parsePrivateKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
        return (RSAPrivateKey) RSAEncryption.getPrivateKey(this.privateKey);
    }

}
