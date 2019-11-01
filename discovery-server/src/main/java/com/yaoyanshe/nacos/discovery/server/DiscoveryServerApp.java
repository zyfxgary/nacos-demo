package com.yaoyanshe.nacos.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 * @author gary
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryServerApp
{
    public static void main( String[] args ) {
        SpringApplication.run(DiscoveryServerApp.class);
    }
}
