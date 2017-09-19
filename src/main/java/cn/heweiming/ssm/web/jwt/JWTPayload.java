package cn.heweiming.ssm.web.jwt;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JWTPayload {

	/*
        // Header
		String ALGORITHM = "alg";
		String CONTENT_TYPE = "cty";
		String TYPE = "typ";
		String KEY_ID = "kid";
	*/

    // Payload
    private static final String ISSUER = "iss";
    private static final String SUBJECT = "sub";
    private static final String EXPIRES_AT = "exp";
    private static final String NOT_BEFORE = "nbf";
    private static final String ISSUED_AT = "iat";
    private static final String JWT_ID = "jti";
    private static final String AUDIENCE = "aud";

    @JsonProperty(JWT_ID)
    private String jwtId;//

    @JsonProperty(SUBJECT)
    private String subject;// jwt所面向的用户

    @JsonProperty(ISSUER)
    private String issuer;// jwt签发者

    @JsonProperty(AUDIENCE)
    private List<String> audience;// 接口jwt的一方

    @JsonProperty(EXPIRES_AT)
    private LocalDateTime expiresAt;// jwt的过期时间，这个过期时间必须要大于签发时间

    @JsonProperty(ISSUED_AT)
    private LocalDateTime issuedAt;// jwt的签发时间

    @JsonProperty(NOT_BEFORE)
    private LocalDateTime notBefore;// 定义在什么时间之前，该jwt都是不可用的.

    public String getJwtId() {
        return jwtId;
    }

    public void setJwtId(String jwtId) {
        this.jwtId = jwtId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public List<String> getAudience() {
        return audience;
    }

    public void setAudience(List<String> audience) {
        this.audience = audience;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
        this.issuedAt = issuedAt;
    }

    public LocalDateTime getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(LocalDateTime notBefore) {
        this.notBefore = notBefore;
    }


}
