package com.yaoyanshe.nacos.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gary
 */
@RestController
@RefreshScope
@RequestMapping("test")
public class TestController {

    @Value("${demo.title:}")
    private String title;

    @GetMapping("hello")
    public String hello(){
        return title;
    }
}
