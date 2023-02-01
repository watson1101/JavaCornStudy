package com.beyondli.listener;/**
 * Created by beyondLi on 2021/9/30 11:34
 */

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @ClassName: TestListener
 * @Author: beyondLi
 * @Date: 2021/9/30 11:34   
 */
@Component
public class TestListener {

    //@KafkaListener(topics = "my-kafka-topic",groupId = "testGroup", errorHandler = "myConsumerAwareErrorHandler")
    @KafkaListener(topics = "my-kafka-topic2",groupId = "testGroup")
    public void getTestListenerInfo(ConsumerRecord<String, String> consumerRecord, Acknowledgment acknowledgment){
        try {
            String value = consumerRecord.value();
            System.out.println(value);
            System.out.println(consumerRecord);
            if (consumerRecord.value().equals("hello")) {
                int i = 1/0;
            }
        }catch (Exception e) {
            System.out.println("An error has occurred, log recorded!");
        }
        //手动提交
        acknowledgment.acknowledge();
    }
}
