package com.blb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;


@EnableDiscoveryClient//eureka客户端
@MapperScan("com.blb.mapper")
@SpringBootApplication
public class Appliction {
    public static void main(String[] args) {
        SpringApplication.run(Appliction.class,args);
    }
}
