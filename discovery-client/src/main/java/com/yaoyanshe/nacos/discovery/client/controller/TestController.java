package com.yaoyanshe.nacos.discovery.client.controller;

import com.yaoyanshe.nacos.discovery.client.DiscoveryClientApp;
import com.yaoyanshe.nacos.discovery.client.feign.DiscoveryServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author gary
 */
@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryServerClient discoveryServerClient;

    @GetMapping(value = "feign-test")
    public String feignTest(@RequestParam(value = "name")String name){
        return discoveryServerClient.hello(name);
    }

    @GetMapping("test")
    public String test() {
        String url =  "http://nacos-discovery-server/test/hello?name=" + "didi";
        String result = restTemplate.getForObject(url, String.class);
        return "return : " + result;
    }
}
