package com.shinesun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * SpringBoot启动类
 *  此处的@MapperScan注解和dao上的@Mapper二选一，不过在此处写比较方便，在
 *  此处写了之后就不需要在每个dao层上都添加@Mapper注解
 * @title
 * @author 胡永持
 * @date 2020/3/19 14:18
 * @return
 */
@MapperScan(basePackages = "com.shinesun.*.dao")
@SpringBootApplication
public class SpringBootDemoApplication extends SpringBootServletInitializer {

//    使用外部web容器时 需要继承SpringBootServletInitializer类 然后重写configure方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
