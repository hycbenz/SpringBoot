package com.shinesun.common.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * 这里是类说明.
 *
 * @className: MyFilter
 * @author: 胡永持
 * @date: 2020-03-18 11:41
 */
public class MyFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("MyFilter init ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("MyFilter doFilter...");

        //进行过滤业务处理

        //放行
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.info("MyFilter destroy ...");
    }
}