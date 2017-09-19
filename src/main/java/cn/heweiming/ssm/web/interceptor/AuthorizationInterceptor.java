package cn.heweiming.ssm.web.interceptor;

import java.security.KeyPair;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.heweiming.ssm.encryption.RSAEncryption;
import cn.heweiming.ssm.properties.RSAEncryptionProperties;

public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(AuthorizationInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		WebApplicationContext context = WebApplicationContextUtils
				.getWebApplicationContext(request.getServletContext());
		RSAEncryptionProperties cryptoProperties = context.getBean(RSAEncryptionProperties.class);
		ObjectMapper objectMapper = context.getBean("objectMapper", ObjectMapper.class);
		String token = request.getHeader(HttpHeaders.AUTHORIZATION);
		logger.error(cryptoProperties.getPrivateKey());
		KeyPair keyPair = RSAEncryption.genKeyPair(1024);
//		Algorithm algorithm = Algorithm.RSA512(publicKey, privateKey);
//		JWT.create().sign(algorithm )
		
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

}
