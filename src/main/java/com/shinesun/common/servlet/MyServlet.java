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
public class MyServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(MyServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("MyServlet doGet ...");
        resp.getWriter().print("hello myServlet ...");
        logger.error("servlet error ....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("MyServlet doPost ...");
    }

    @Override
    public void init() throws ServletException {
        logger.info("MyServlet init ...");
    }
}