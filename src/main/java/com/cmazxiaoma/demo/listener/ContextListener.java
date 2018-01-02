package com.cmazxiaoma.demo.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

@Slf4j
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("context initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("context destroyed");
    }

}
