package com.cmazxiaoma.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/interceptor1")
    public String testInterceptor1(HttpSession session) {
        session.setAttribute("test1", "interceptor1");
        session.invalidate();
        return "testInterceptor1";
    }

    @GetMapping("/interceptor2")
    public String testInterceptor2(HttpSession session) {
        session.setAttribute("test2", "interceptor2");
        session.invalidate();
        return "testInterceptor2";
    }
}
