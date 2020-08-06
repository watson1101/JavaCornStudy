package com.hong.spring5.applicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cmss-hong
 */
public class DemoMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
            EventConfig.class);

        DemoPublisher publisher = annotationConfigApplicationContext.getBean(DemoPublisher.class);
        publisher.publish("Hello, envent!");
        annotationConfigApplicationContext.close();
    }
}
