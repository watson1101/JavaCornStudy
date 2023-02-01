package com.beyondli.controller;/**
 * Created by beyondLi on 2021/9/29 16:08
 */

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @ClassName: KafkaController
 * @Author: beyondLi
 * @Date: 2021/9/29 16:08   
 */
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final static String TOPIC_NAME = "my-kafka-topic2";

    @Resource
    KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send/{info}", method = RequestMethod.GET)
    public String sendInfo (@PathVariable("info")String info) {
        ListenableFuture key = kafkaTemplate.send(TOPIC_NAME, info);
        System.out.println("key = "+key);
        return "send success，key = "+ info;
    }
}
