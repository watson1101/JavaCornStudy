package com.csrcb.service;

import com.csrcb.config.RabbitMqConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @Classname ConsumerService
 * @Date 2020/8/7 14:36
 * @Created by gangye
 */
@Component
@Slf4j
public class ConsumerService {

    @RabbitListener(queues = RabbitMqConfig.QUEUE_A)
    @RabbitHandler
    public void consumeMessage(Message message){
        log.info("收到的消息:{}",message);
    }

}
