package com.zhuanqian;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/5/11.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ApiApplication.class)
public class RedisDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisDemo.class);

    @Autowired
    private RedisTemplate redisTemplate;

//    @Test
//    public void helloWorld(){
//        redisTemplate.opsForValue().set("hello", "dsada");
//        LOGGER.info((String)redisTemplate.opsForValue().get("hello"));
//    }

    /**
     * 生产者
     */
    @Test
    public void producer(){
        redisTemplate.convertAndSend("test", "hello");
    }
}
