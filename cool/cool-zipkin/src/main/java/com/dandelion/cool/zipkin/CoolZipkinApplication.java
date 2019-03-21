package com.dandelion.cool.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;
/**
 *链路数据追踪启动类
 * @author Mr.QinJiang
 * @create 2019/3/8
 * @modify 2019/3/8 by Mr.QinJiang
 */
@EnableDiscoveryClient
@EnableZipkinServer
@SpringBootApplication
public class CoolZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolZipkinApplication.class, args);
    }

}
