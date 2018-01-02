package com.cmazxiaoma.demo.filter;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class TestFilter1 extends OncePerRequestFilter {
    private String username;
    private String password;

    public TestFilter1() {}

    public TestFilter1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        log.info("TestFilter1 doFilterInternal started, username = {} , password = {} ", username, password);
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        log.info("TestFilter1 doFilterInternal end, username = {} , password = {}", username, password);
    }
}
