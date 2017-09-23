package cn.heweiming.ssm.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * @author heweiming  2017年9月23日 下午5:15:31
 * @version 1.0.0
 * @description 
 */
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
public class DataSourceConfig implements TransactionManagementConfigurer {

	@Autowired
	private DataSource dataSource;

	@Override
	@Bean(name = "transactionManager")
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}

}
