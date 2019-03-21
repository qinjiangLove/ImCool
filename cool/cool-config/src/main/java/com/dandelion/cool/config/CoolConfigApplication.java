package com.dandelion.cool.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * config配置启动类
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class CoolConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolConfigApplication.class, args);
    }

}
