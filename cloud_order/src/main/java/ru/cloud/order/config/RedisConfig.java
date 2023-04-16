package ru.cloud.order.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.GenericToStringSerializer;
//import org.springframework.integration.redis.util.RedisLockRegistry;
//import redis.clients.jedis.DefaultJedisClientConfig;
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisClientConfig;

import java.time.Duration;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

//@Configuration
public class RedisConfig {
    public static final String SYNCLOCK = "synclock";
    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private Integer port;

    @Value("${spring.redis.password}")
    private String password;

//    @Bean
//    public Jedis jedis() {
//        JedisClientConfig jedisClientConfig =
//                DefaultJedisClientConfig.
//                        builder().password(password).build();
//        return new Jedis(new HostAndPort(host, port), jedisClientConfig);
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//        template.setConnectionFactory(redisConnectionFactory);
//        template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
//        return template;
//    }

//    @Bean
//    public RedisLockRegistry redisLockRegistry(RedisConnectionFactory redisConnectionFactory) {
//        return new RedisLockRegistry(redisConnectionFactory, SYNCLOCK, LOCK_MAX_AGE_MS);
//    }
//
//    @Bean
//    public LockProvider lockProvider(RedisConnectionFactory connectionFactory) {
//        return new RedisLockProvider(connectionFactory);
//    }

//    @Bean
//    @Primary
//    public CacheManager redisCacheManager(RedisConnectionFactory redisConnectionFactory) {
//        return RedisCacheManager
//                .builder(redisConnectionFactory)
//                .cacheDefaults(RedisCacheConfiguration
//                        .defaultCacheConfig()
//                        .disableCachingNullValues()
//                        .entryTtl(Duration.ofDays(3)))
//                .build();
//    }

}
