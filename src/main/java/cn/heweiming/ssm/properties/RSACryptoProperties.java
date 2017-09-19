package cn.heweiming.ssm.properties;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import cn.heweiming.ssm.crypto.RSACryptography;

@Component
@ConfigurationProperties(prefix = RSACryptoProperties.CONFIG_PROPERTIES_PREFIX)
@Validated
public class RSACryptoProperties {

    protected final static String CONFIG_PROPERTIES_PREFIX = "crypto.rsa";

    @NotEmpty(message = "RSA密钥不能为空")
    private String privateKey;

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public RSAPrivateKey parsePrivateKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
        return (RSAPrivateKey) RSACryptography.getPrivateKey(this.privateKey);
    }

}
