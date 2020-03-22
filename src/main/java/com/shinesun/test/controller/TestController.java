package com.shinesun.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 这里是类说明.
 *
 * @className: TestController
 * @author: 胡永持
 * @date: 2020-03-18 11:31
 */
@Controller
public class TestController {

    @GetMapping("/hello/test")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}