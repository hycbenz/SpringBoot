package com.shinesun;

import com.shinesun.common.util.RedisUtil;
import com.shinesun.test.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
//        RedisUtil redisUtil = new RedisUtil();
//        System.out.println(jdbcTemplate.getDataSource());
        redisUtil.setObject("test", new User("zhangsan", 22));

        User user = redisUtil.getObject("test", User.class);
        System.out.println("user: " + user);
    }

    @Test
    public void testRedisDel() {
//        redisUtil.delString("test");
        redisUtil.delObject("test");
    }

}
