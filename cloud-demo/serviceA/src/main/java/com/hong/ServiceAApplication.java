package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ServletComponentScan 该注解用于使用注解 @WebFilter 来配置过滤器
 * @See com.hong.user.filter.UserFilterAnno
 *
 * @author hongw
 */
//@EnableFeignClients
//@EnableEurekaClient
@SpringBootApplication

@ServletComponentScan("com.hong.user.filter")
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
}
