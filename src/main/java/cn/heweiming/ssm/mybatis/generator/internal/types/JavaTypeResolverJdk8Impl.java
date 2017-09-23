package cn.heweiming.ssm.mybatis.generator.internal.types;

import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * @author heweiming  2017年9月23日 下午5:17:12
 * @version 1.0.0
 * @description 
 */
public class JavaTypeResolverJdk8Impl extends JavaTypeResolverDefaultImpl {

    public JavaTypeResolverJdk8Impl() {
        super();

        typeMap.put(Types.DATE, new JdbcTypeInformation("DATE", new FullyQualifiedJavaType(LocalDate.class.getName())));

        typeMap.put(Types.TIME,
                new JdbcTypeInformation("TIME", new FullyQualifiedJavaType(LocalDateTime.class.getName())));

        typeMap.put(Types.TIMESTAMP,
                new JdbcTypeInformation("TIMESTAMP", new FullyQualifiedJavaType(LocalDateTime.class.getName())));

    }

}
