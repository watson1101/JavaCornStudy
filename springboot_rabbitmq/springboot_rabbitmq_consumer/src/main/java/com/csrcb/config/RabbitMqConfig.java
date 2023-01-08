package com.csrcb.config;

import org.springframework.context.annotation.Configuration;

/**
 * @Classname RabbitMqConfig
 * @Description RabbitMq配置类
 * @Date 2020/8/6 10:35
 * @Created by gangye
 */
@Configuration
public class RabbitMqConfig {

    public static final String EXCHANGE_A = "my-mq-direct_exchange";
    public static final String EXCHANGE_B = "my-mq-exchange_B";
    public static final String EXCHANGE_C = "my-mq-exchange_C";


    public static final String QUEUE_A = "QUEUE_A";
    public static final String QUEUE_A_FAIL = "QUEUE_A_FAIL";
    public static final String QUEUE_B = "QUEUE_B";

    public static final String ROUTINGKEY_A = "spring-boot-routingKey_A";
    public static final String ROUTINGKEY_A_FAIL = "spring-boot-routingKey_A_FAIL";
    public static final String ROUTINGKEY_B = "spring-boot-routingKey_B";

    //此处可以配置rabbitmq的相关配置，不过配置了就类似于消息队列的生产者
}
