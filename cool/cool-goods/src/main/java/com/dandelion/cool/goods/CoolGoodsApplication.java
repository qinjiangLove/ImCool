package com.dandelion.cool.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 商品模块启动类
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
@EnableAutoConfiguration
@RefreshScope
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.dandelion.cool.goods.dao.**")
@EnableFeignClients(basePackages = "com.dandelion.cool.feign.**")
@EnableAsync
public class CoolGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolGoodsApplication.class, args);
    }

}
