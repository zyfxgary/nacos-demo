package com.yaoyanshe.nacos.discovery.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-discovery-server")
public interface DiscoveryServerClient {

    /**
     * 测试
     * @param name　姓名
     * @return　返回内容
     */
    @GetMapping("/test/hello")
    String hello(@RequestParam(value = "name") String name);
}
