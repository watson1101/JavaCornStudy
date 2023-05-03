package com.hong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.hong.mapper")
// nacos注册中心
@EnableDiscoveryClient
public class OrderServer {

    /**
     * 实例方法：构建实例对象，交给容器管理<br/>
     * 在启动类中创建该方法，用于支持RestTemplate远程调用。
     *
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(OrderServer.class, args);
    }
}
