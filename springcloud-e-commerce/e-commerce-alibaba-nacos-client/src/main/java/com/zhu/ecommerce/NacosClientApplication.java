package com.zhu.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h1>Nacos Client 工程启动入口</h1>
 * @EnableDiscoveryClient 将服务注册到注册中心 可以不写 从哪个版本开始
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class NacosClientApplication {
    public static void main(String[] args) {

        SpringApplication.run(NacosClientApplication.class, args);
    }
}
