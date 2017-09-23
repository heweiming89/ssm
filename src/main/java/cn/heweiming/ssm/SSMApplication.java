package cn.heweiming.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author heweiming  2017年9月23日 下午5:20:25
 * @version 1.0.0
 * @description 
 */
@SpringBootApplication
public class SSMApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SSMApplication.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String[] activeProfiles = environment.getActiveProfiles();
        for (String activeProfile : activeProfiles) {
            System.err.println(activeProfile);
        }
    }

}
