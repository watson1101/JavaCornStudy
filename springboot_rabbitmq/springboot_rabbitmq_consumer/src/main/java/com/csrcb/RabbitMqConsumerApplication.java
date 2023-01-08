package com.csrcb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname RabbitMqConsumerApplication
 * @Description rabbitmq消费者项目启动类
 * @Date 2020/8/6 10:14
 * @Created by gangye
 */
@SpringBootApplication
public class RabbitMqConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMqConsumerApplication.class, args);
    }
}
