package com.shinesun.common.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 这里是类说明.
 *
 * @className: MyServlet
 * @author: 胡永持
 * @date: 2020-03-18 11:15
 */
public class InitServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(InitServlet.class);

    @Override
    public void init() throws ServletException {
        logger.info("MyServlet init ...");
    }
}