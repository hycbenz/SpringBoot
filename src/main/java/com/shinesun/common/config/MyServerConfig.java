package com.shinesun.common.config;

import com.shinesun.common.filter.MyFilter;
import com.shinesun.common.listener.MyListener;
import com.shinesun.common.servlet.InitServlet;
import com.shinesun.common.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * servlet配置类主要是将servlet，filter，listener注册到容器中.
 *  启动的顺序为: listener -> filter -> servlet
 *
 * @className: MyServerConfig
 * @author: 胡永持
 * @date: 2020-03-18 11:17
 */
@Configuration
public class MyServerConfig {

//    @Bean
//    public ServletRegistrationBean myInitServlet() {
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
//        registrationBean.setServlet(new InitServlet());
//        registrationBean.setLoadOnStartup(99);
//        return registrationBean;
//    }

    /**
     * 将servlet注册到容器中
     * @title myServlet
     * @author 胡永持
     * @date 2020/3/18 11:18
     * @param
     * @return org.springframework.boot.web.servlet.ServletRegistrationBean
     */
    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new MyServlet());

        /**设置servlet在容器启动时被加载
         *  1、它的值必须是一个整数，表示servlet应该被载入的顺序。如果该元素不存在或者这个数为负时，则容器会当该Servlet被请求时，再加载。
         *  2、当值为0或者大于0时，表示容器在应用启动时就加载并初始化这个servlet；正数的值越小，该servlet的优先级越高，
         *      应用启动时就越先加载。当值相同时，容器就会自己选择顺序来加载
         */
        servletRegistrationBean.setLoadOnStartup(1);

//        servlet处理的请求路径 不支持通配符，需要些具体的路径
        servletRegistrationBean.addUrlMappings("/myServlet");

        return servletRegistrationBean;
    }

    /**
     * 将filter注册到容器中
     * @title myFilter
     * @author 胡永持
     * @date 2020/3/18 11:46
     * @param
     * @return org.springframework.boot.web.servlet.FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        //配置过滤的路径
        filterRegistrationBean.addUrlPatterns("/myServlet");
        return filterRegistrationBean;
    }

    /**
     * 将listener注册到容器中
     * @title myListener
     * @author 胡永持
     * @date 2020/3/18 11:52
     * @param
     * @return org.springframework.boot.web.servlet.ServletListenerRegistrationBean
     */
    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean<MyListener> listenerRegistrationBean = new ServletListenerRegistrationBean<>();
        listenerRegistrationBean.setListener(new MyListener());
        return listenerRegistrationBean;
    }

}