package cn.heweiming.ssm.api;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.heweiming.ssm.web.util.JwtUserUtils;

/**
 * @author heweiming  2017年9月23日 下午5:15:06
 * @version 1.0.0
 * @description 
 */
public interface BaseAPI {

    public default String currentUser() {
        ServletRequestAttributes sra = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        HttpServletRequest request = sra.getRequest();

        try {
            String currentUser = JwtUserUtils.getCurrentUser(request);
            return currentUser;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException("用户信息不正确");
        }

    }

}
