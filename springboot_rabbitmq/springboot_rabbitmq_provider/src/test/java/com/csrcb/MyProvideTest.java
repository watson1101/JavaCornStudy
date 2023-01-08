package com.csrcb;

import com.csrcb.config.RabbitMqConfig;
import com.csrcb.service.QueueMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Classname MyProvideTest
 * @Date 2020/8/20 17:25
 * @Created by gangye
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqProviderApplication.class)
public class MyProvideTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test1() throws Exception{
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_A,RabbitMqConfig.ROUTINGKEY_A,"test message");
    }
}
