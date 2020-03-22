package com.shinesun.common.config;

import com.shinesun.common.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 这里是类说明.
 *
 * @className: MyInterceptorConfig
 * @author: 胡永持
 * @date: 2020-03-19 11:07
 */
@Configuration
public class MyInterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截器拦截路径
        String[] addPath = {"/**"};

        //拦截器不拦截路径
        String[] excludePath = {""};

        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPath).excludePathPatterns(excludePath);

        super.addInterceptors(registry);
    }


}