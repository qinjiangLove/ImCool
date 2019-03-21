package com.dandelion.cool.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAutoConfiguration
@RefreshScope
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.dandelion.cool.order.dao.**")
@EnableFeignClients(basePackages = "com.dandelion.cool.feign.**")
@EnableAsync
public class CoolOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolOrderApplication.class, args);
    }

}
