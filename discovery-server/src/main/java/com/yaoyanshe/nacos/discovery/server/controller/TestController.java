package com.yaoyanshe.nacos.discovery.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gary
 */
@RequestMapping("test")
@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        logger.info("invoked name = " + name);
        return "hello " + name;
    }
}
