package com.zhia.zhiagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZhiaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiaGatewayApplication.class, args);
    }

}
