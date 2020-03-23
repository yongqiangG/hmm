package com.johnny.udpserver.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {
    private static Logger logger = LoggerFactory.getLogger(RedisUtil.class);
    private static RedisTemplate redisTemplate;

    @Autowired
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisUtil.redisTemplate = redisTemplate;
    }

    /**
     * 普通缓存放入
     */
    public static boolean sSet(String key, Object value) {
        try {
            RedisUtil.redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    /**
     * 普通缓存放入并设置时间
     */
    public static boolean sSetEx(String key, Object value, Long exTime) {
        try {
            RedisUtil.redisTemplate.opsForValue().set(key, value, exTime, TimeUnit.SECONDS);
            return true;
        }catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    /**
     * 普通缓存获取
     */
    public static Object sGet(String key) {
        return key == null ? null : RedisUtil.redisTemplate.opsForValue().get(key);
    }
}
