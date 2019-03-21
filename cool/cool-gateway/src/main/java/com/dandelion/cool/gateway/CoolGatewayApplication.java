package com.dandelion.cool.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 *  网关启动类
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
@EnableAutoConfiguration
@SpringBootApplication
@RefreshScope
@EnableZuulProxy
@MapperScan("com.dandelion.cool.gateway.*")
public class CoolGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolGatewayApplication.class, args);
    }

}
