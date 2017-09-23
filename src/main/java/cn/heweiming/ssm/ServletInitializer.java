package cn.heweiming.ssm;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author heweiming  2017年9月23日 下午5:20:21
 * @version 1.0.0
 * @description 
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SSMApplication.class);
    }

}
