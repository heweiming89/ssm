package cn.heweiming.ssm.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author heweiming  2017年9月23日 下午5:17:44
 * @version 1.0.0
 * @description 
 */
@Component
@ConfigurationProperties(prefix = CustomizedConfigProperties.CUSTOMIZED_CONFIG_PROPERTIES_PREFIX)
@Validated
public class CustomizedConfigProperties {

    protected final static String CUSTOMIZED_CONFIG_PROPERTIES_PREFIX = "";

}
