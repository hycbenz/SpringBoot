package com.shinesun.common.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * redis操作工具类.
 *  测试发现使用redisTemplate存入的数据用stringRedisTemplate删除不了
 * @className: RedisUtil
 * @author: 胡永持
 * @date: 2020-03-21 15:57
 */
@Component
public class RedisUtil {

    @Resource
    private RedisTemplate<Object, Object> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 设置过期时间(字符串)
     * @title expire
     * @author 胡永持
     * @date 2020/3/21 16:04
     * @param key       redis中的key
     * @param second    过期的时间
     * @return boolean
     */
    public boolean expireString(String key, int second) {
        return stringRedisTemplate.expire(key, second, TimeUnit.SECONDS);
    }

    /**
     * 删除字符串数据(字符串)
     * @title del
     * @author 胡永持
     * @date 2020/3/21 16:06
     * @param key   redis中的key
     * @return void
     */
    public void delString(String key) {
        stringRedisTemplate.delete(key);
    }

    /**
     * 存放字符串(字符串)
     * @title setString
     * @author 胡永持
     * @date 2020/3/21 16:09
     * @param key       redis中的key
     * @param value     key对应的值
     * @return void
     */
    public void setString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    /**
     * 存放字符串(字符串)
     * @title setString
     * @author 胡永持
     * @date 2020/3/21 16:10
     * @param key       redis中的key
     * @param value     key对应的值
     * @param second    过期时间
     * @return void
     */
    public void setString(String key, String value, long second) {
        stringRedisTemplate.opsForValue().set(key, value, second, TimeUnit.SECONDS);
    }

    /**
     * 获取字符串值
     * @title getString
     * @author 胡永持
     * @date 2020/3/21 16:13
     * @param key       redis中的key
     * @return java.lang.String
     */
    public String getString(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    /**
     * 设置过期时间(对象类型)
     * @title expire
     * @author 胡永持
     * @date 2020/3/21 16:36
     * @param key       redis中的key
     * @param second    过期的时间
     * @return boolean
     */
    public boolean expireObject(String key, int second) {
        return redisTemplate.expire(key, second, TimeUnit.SECONDS);
    }

    /**
     * 删除存放的数据(对象类型)
     * @title delObject
     * @author 胡永持
     * @date 2020/3/21 16:35
     * @param key       redis中的key
     * @return void
     */
    public void delObject(String key) {
        redisTemplate.delete(key);
    }

    /**
     * 存放数据(对象类型)
     * @title setObject
     * @author 胡永持
     * @date 2020/3/21 16:40
     * @param key       redis中的key
     * @param obj     key对应的值
     * @return void
     */
    public void setObject(String key, Object obj) {
        redisTemplate.opsForValue().set(key, obj);
    }

    /**
     * 存放数据(对象类型)
     * @title setObject
     * @author 胡永持
     * @date 2020/3/21 16:42
     * @param key       redis中的key
     * @param obj     key对应的值
     * @param second    过期时间
     * @return void
     */
    public void setObject(String key, Object obj, long second) {
        redisTemplate.opsForValue().set(key, obj, second, TimeUnit.SECONDS);
    }

    /**
     * 获取数据(对象类型)
     * @title getObject
     * @author 胡永持
     * @date 2020/3/21 16:42
     * @param key       redis中的key
     * @param c         对象类型
     * @return T
     */
    public <T> T getObject(String key, Class<T> c) {
        //这样写虽然实现了对象转换，但是总感觉有点怪怪的
        String string = String.valueOf(redisTemplate.opsForValue().get(key));
        return JSONObject.parseObject(string, c);
    }

}