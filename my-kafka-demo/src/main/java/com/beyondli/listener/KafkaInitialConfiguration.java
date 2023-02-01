package com.beyondli.listener;

import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;

//@Configuration
public class KafkaInitialConfiguration {

    //异常处理器
    @Bean
    public ConsumerAwareListenerErrorHandler myConsumerAwareErrorHandler() {
        return new ConsumerAwareListenerErrorHandler() {
            @Override
            public Object handleError(Message<?> message, ListenerExecutionFailedException exception,
                                      Consumer<?, ?> consumer) {
                System.out.println("--- 发生消费异常 ---");
                System.out.println(message.getPayload());
                System.out.println(exception);

                return null;
            }
        };
    }
}