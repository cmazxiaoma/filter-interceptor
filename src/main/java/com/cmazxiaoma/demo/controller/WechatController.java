package com.cmazxiaoma.demo.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/wechat")
@RestController
@Slf4j
public class WechatController {

    @GetMapping("/valid")
    public String valid(HttpServletRequest request, HttpServletResponse response) {
        String signature = request.getParameter("signture");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        log.info("signtrue = {}", signature);
        log.info("timestamp = {}", timestamp);
        log.info("nonce = {}", nonce);
        log.info("echostr = {}", echostr);
        return echostr;
    }
}
