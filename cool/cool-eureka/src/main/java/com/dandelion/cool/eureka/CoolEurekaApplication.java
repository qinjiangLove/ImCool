package com.dandelion.cool.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 *
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 * eureka模块启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class CoolEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolEurekaApplication.class, args);
    }

}
