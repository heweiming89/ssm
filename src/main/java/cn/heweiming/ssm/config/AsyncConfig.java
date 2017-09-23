package cn.heweiming.ssm.config;

import java.util.concurrent.Executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import io.github.jhipster.async.ExceptionHandlingAsyncTaskExecutor;
import io.github.jhipster.config.JHipsterProperties;

@EnableAsync
@EnableScheduling
public class AsyncConfig implements AsyncConfigurer {

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(AsyncConfig.class);

	private final JHipsterProperties jHipsterProperties;

	public AsyncConfig(JHipsterProperties jHipsterProperties) {
		this.jHipsterProperties = jHipsterProperties;
	}

	@Override
	@Bean(name = "taskExecutor")
	public Executor getAsyncExecutor() {
		logger.debug("Creating Async Task Executor");
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(jHipsterProperties.getAsync().getCorePoolSize());
		executor.setMaxPoolSize(jHipsterProperties.getAsync().getMaxPoolSize());
		executor.setQueueCapacity(jHipsterProperties.getAsync().getQueueCapacity());
		executor.setThreadNamePrefix("SSM-Executor-");
		return new ExceptionHandlingAsyncTaskExecutor(executor);
	}

	@Bean(name = "asyncUncaughtExceptionHandler")
	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return (ex, method, params) -> logger.error(String.format("调用异步时发生意外错误 方法 '%s'.", method), ex);
	}
}
