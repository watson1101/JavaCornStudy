package com.csrcb.controller;

import com.csrcb.config.RabbitMqConfig;
import com.csrcb.service.QueueMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Classname ProvoderSend
 * @Description 生产者路由
 * @Date 2020/8/4 17:24
 * @Created by gangye
 */
@RestController
@RequestMapping(value = "/provider")
@Slf4j
public class ProvoderSend {
    @Autowired
    private QueueMessageService queueMessageService;

    @PostMapping("/send")
    public String sendMessage() {
        try {
            Map<String, Object> messageMap = new HashMap<>();
            messageMap.put("messageId",UUID.randomUUID().toString());
            messageMap.put("messageData","测试信息");
            messageMap.put("createTime", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            queueMessageService.send(messageMap, RabbitMqConfig.EXCHANGE_A, RabbitMqConfig.ROUTINGKEY_A);
            return "success";
        } catch (Exception e) {
            log.error(""+e);
            return "error";
        }
    }
}
