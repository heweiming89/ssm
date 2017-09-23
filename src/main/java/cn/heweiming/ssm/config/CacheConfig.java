package cn.heweiming.ssm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author heweiming  2017年9月23日 下午5:15:23
 * @version 1.0.0
 * @description 
 */
@EnableCaching // 启用缓存，这个注解很重要；
public class CacheConfig extends CachingConfigurerSupport {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Bean
    @Override
    public CacheManager cacheManager() {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate());
        return cacheManager;
    }

    @Override
    public KeyGenerator keyGenerator() {
        // TODO Auto-generated method stub
        return super.keyGenerator();
    }

    @Override
    public CacheResolver cacheResolver() {
        // TODO Auto-generated method stub
        return super.cacheResolver();
    }

    @Override
    public CacheErrorHandler errorHandler() {
        // TODO Auto-generated method stub
        return super.errorHandler();
    }

    @Bean
    public RedisAtomicLong redisAtomicLong() {
        RedisAtomicLong atomicLong = new RedisAtomicLong("APPLICATION_COUNTER_NAME", redisConnectionFactory);
        atomicLong.incrementAndGet();
        return atomicLong;
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(
                Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);

        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        JdkSerializationRedisSerializer jdkSerializationRedisSerializer = new JdkSerializationRedisSerializer();

        redisTemplate.setKeySerializer(stringRedisSerializer);
//        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
//        redisTemplate.setHashValueSerializer(stringRedisSerializer);
//        redisTemplate.afterPropertiesSet();

        return redisTemplate;
    }

    /**
     * 操作Redis String（或者Value）类型数据
     *
     * @return
     */
    @Bean
    public ValueOperations<String, Object> valueOperations() {
        ValueOperations<String, Object> valueOperations = redisTemplate().opsForValue();
        return valueOperations;
    }

    /**
     * 操作Redis List类型数据
     *
     * @return
     */
    @Bean
    public ListOperations<String, Object> listOperations() {
        ListOperations<String, Object> listOperations = redisTemplate().opsForList();
        return listOperations;
    }

    /**
     * 操作Redis Set类型数据
     *
     * @return
     */
    @Bean
    public SetOperations<String, Object> setOperations() {
        SetOperations<String, Object> setOperations = redisTemplate().opsForSet();
        return setOperations;
    }

    /**
     * 操作Redis ZSet（或者Sorted Set）类型数据
     *
     * @return
     */
    @Bean
    public ZSetOperations<String, Object> zSetOperations() {
        ZSetOperations<String, Object> zSetOperations = redisTemplate().opsForZSet();
        return zSetOperations;
    }

    /**
     * 操作Redis Hash类型数据
     *
     * @return
     */
    @Bean
    public HashOperations<String, Object, Object> hashOperations() {
        HashOperations<String, Object, Object> hashOperations = redisTemplate().opsForHash();
        return hashOperations;
    }

}