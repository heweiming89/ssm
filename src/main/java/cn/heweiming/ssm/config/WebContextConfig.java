package cn.heweiming.ssm.config;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import cn.heweiming.ssm.constant.ConfigConstant;
import cn.heweiming.ssm.web.interceptor.AuthorizationInterceptor;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author heweiming  2017年9月23日 下午5:16:15
 * @version 1.0.0
 * @description 
 */
@Configuration
@Import(value = {JacksonConfig.class, Swagger2Config.class, ServletConfig.class})
@ServletComponentScan(basePackages = ConfigConstant.LISTENER_BASE_PACKAGES)
@EnableWebMvc // 启用 Spring MVC
@ComponentScan(basePackages = {ConfigConstant.SCAN_BASE_PACKAGES}, useDefaultFilters = false, includeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = Controller.class),
        @Filter(type = FilterType.ANNOTATION, value = RestController.class),
        @Filter(type = FilterType.ANNOTATION, value = ControllerAdvice.class)})
@EnableSwagger2
public class WebContextConfig extends WebMvcConfigurerAdapter {

    @SuppressWarnings("unused")
    @Autowired
    private Environment env;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private XmlMapper xmlMapper;

    @Bean /* 文件上传配置 */
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable(); // 配置静态资源的处理
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthorizationInterceptor());
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter jsonHmc = new MappingJackson2HttpMessageConverter();
        jsonHmc.setSupportedMediaTypes(
                Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON_UTF8, MediaType.TEXT_HTML));
        jsonHmc.setObjectMapper(this.objectMapper);
        converters.add(jsonHmc);

        MappingJackson2XmlHttpMessageConverter xmlHmc = new MappingJackson2XmlHttpMessageConverter();
        xmlHmc.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_XML, MediaType.APPLICATION_ATOM_XML,
                MediaType.APPLICATION_XHTML_XML, MediaType.TEXT_XML));
        xmlHmc.setObjectMapper(this.xmlMapper);
        converters.add(xmlHmc);
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.mediaType("json", MediaType.APPLICATION_JSON);
        configurer.mediaType("xml", MediaType.APPLICATION_XML);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true).maxAge(TimeUnit.DAYS.toMillis(1));
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        final String staticPattern = "/static/**";
        final String staticLocations = "classpath:/static/";
        if (!registry.hasMappingForPattern(staticPattern)) {
            registry.addResourceHandler(staticPattern).addResourceLocations(staticLocations);
        }

        final String webjarsPattern = "/webjars/**";
        final String webjarsLocations = "classpath:/META-INF/resources/webjars/";
        if (!registry.hasMappingForPattern(webjarsPattern)) {
            registry.addResourceHandler(webjarsPattern).addResourceLocations(webjarsLocations);
        }

    }

}
