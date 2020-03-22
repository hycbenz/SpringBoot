package com.shinesun.common.config;

import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * redis配置类.
 *
 * @className: MyRedisConfig
 * @author: 胡永持
 * @date: 2020-03-21 15:49
 */
@Configuration
public class MyRedisConfig {

    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        修改redis默认的序列化器，默认使用的是jdk的序列化器，将默认的jdk序列化器更改为Jackson序列化器
//        redisTemplate.setDefaultSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
//        使用FastJsonRedisSerializer序列化器可以实现在存入和查询对象数据时都是json字符串，方便以后的转换
        redisTemplate.setDefaultSerializer(new FastJsonRedisSerializer<>(Object.class));
        return redisTemplate;
    }

}