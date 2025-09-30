package com.zhu.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * <h1>授权中心启动入口</h1>
 */
@EnableJpaAuditing //允许 jpa 自动审计
@SpringBootApplication
@EnableDiscoveryClient
public class AuthorityCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthorityCenterApplication.class,args);
    }
}
