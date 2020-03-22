package com.shinesun.common.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 这里是类说明.
 *
 * @className: MyListener
 * @author: 胡永持
 * @date: 2020-03-18 11:48
 */
public class MyListener implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(MyListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("MyListener contextInitialized ...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("MyListener contextDestroyed...");
    }
}